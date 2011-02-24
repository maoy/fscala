#!/bin/sh
exec scala -savecompiled $0 $@
!#
println("Hello, world, from a script! " + (args toList) )
//throw new RuntimeException("hehe")


