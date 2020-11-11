def arg = ["Groovy","Java","Python","nodeJS"]

println arg.class  //class java.util.ArrayList

println arg[1] //Java e.g. we are starting at 0

// TEST
def no = [1,2,3,4]
println no

def no2 = no +5 //=[1,2,3,4,5]
println no2

def no3 = no - [2,3] //=[1,4]
println no3

// More manipulations
arg.add("Ruby")
println(arg) //=[Groovy, Java, Python, NodeJS, Ruby]

arg << "Smalltalk"
println(arg) //=[Groovy, Java, Python, NodeJS, Ruby, Smalltalk]

arg[5] = "C++" 
println(arg) //=[Groovy, Java, Python, NodeJS, Ruby, C++]
