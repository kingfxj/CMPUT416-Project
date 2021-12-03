import java.util.*;
import soot.*;
import soot.options.Options;
import soot.jimple.toolkits.callgraph.*;

class Scratch {
    public static void main(String[] args) {
        Options.v().parse(args);
        Scene.v().loadNecessaryClasses();

        Map<String, String> cgMap = new HashMap<String, String>();
        cgMap.put("enabled", "true");
        cgMap.put("apponly", "true");

        CHATransformer.v().transform("wjtp", cgMap);

        CallGraph cg = Scene.v().getCallGraph();
        // System.out.println(cg.size());
        System.out.println(cg.toString());

    }
}

// java -cp sootclasses-trunk-jar-with-dependencies.jar scratch.java -cp . -pp -process-dir imagej1/ij.jar -allow-phantom-refs -w ij.ImageJ > toString.txt
