# java command 

java -jar Compiler.jar [path/filename]

# must be this for program needing input
java -jar tvi-2.2.0.jar [filename]

# compile helper

python compile.py [-a] [-d:dir] [-f:filename] [-h] [-v]

-h: show help
-a: flag, if compile all files in directory, default is false
-f [filename]: compile a single file
-d [dir]: compile all files in given directory
-v: flag, if show output in console, default is false


# run compiled files
##!! does not work for programs that need input


python run.py [-a] [-d:dir] [-f:filename] [-h] [-o]

-h: show help
-a: flag, if run all compiled files in directory, default is false
-f [filename]: run a single file
-d [dir]: run all files in given directory, defualt is current path
-o: flag, if write output in a file, default is false