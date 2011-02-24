#!/usr/bin/env scalacript
class Blah {
    def blahMethod(x:Int) = x + 1
}
def printList(name: String, x:List[_]) {
  println("%s is %s".format(name, x.toString))
}
println("Hello world, from a script! ")
printList("args", args.toList )
printList("argv", argv.toList )
println( new Blah().blahMethod(args(0).toInt) )

