import java.util.*;
import soot.*;
import soot.options.Options;
import soot.jimple.toolkits.callgraph.*;

class Scratch {
    public static void main(String[] args) {
        final long startTime = System.nanoTime();
        Options.v().parse(args);
        Scene.v().loadNecessaryClasses();

        Map<String, String> cgMap = new HashMap<String, String>();
        cgMap.put("enabled", "true");
        cgMap.put("apponly", "true");

        CHATransformer.v().transform("wjtp", cgMap);

        final long duration = System.nanoTime() - startTime;
        CallGraph cg = Scene.v().getCallGraph();

        System.out.print("Size: ");
        System.out.println(cg.size());
        System.out.println("\nDuration: ");
        System.out.print(duration);
        System.out.println(" nano seconds");
        System.out.print(duration/1000000000);
        System.out.println(" seconds");
        System.out.println(cg.toString());
    }
}

// java -cp sootclasses-trunk-jar-with-dependencies.jar soot.java -cp ../ -pp -process-dir ../imagej1/ij.jar -allow-phantom-refs -w ij.ImageJ > toString.txt
