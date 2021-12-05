from graphviz import Source

text_from_file = str()
with open('toString.txt') as file:
    text_from_file = file.read()

src = Source(text_from_file)
src.render('test.gv', view=True ) 
