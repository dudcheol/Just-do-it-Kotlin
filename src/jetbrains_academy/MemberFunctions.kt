package jetbrains_academy

class Application(val name: String) {

    // write the run method here
    fun run(args:Array<String>) {
        println(name)
        for(a in args)
            println(a)
    }
}

fun main() {

}