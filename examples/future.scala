#!/usr/bin/env scalacript
import scala.concurrent.ops._;

val args = List(1,2)
val foo = "foo";
val willBeFoo = future(foo);
println(willBeFoo());

def printList(name: String, x:List[_]) {
  println("%s is %s".format(name, x.toString))
}
printList("args", args.toList )
printList("argv", argv.toList )

