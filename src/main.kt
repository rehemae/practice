fun main() {
     nameOfboys(arrayOf("asha","amina","adija"))

    var add=sum(30,60,4,7)
    println(add)

     var reminder=modulus(30,13)
    println(reminder)
    var x=surName("Anna")

}
fun sum(num1: Int, num2: Int, num3: Int, num4: Int):Int{
    var add=num1+num2+num3+num4
    return add
}
fun modulus(num1: Int, num2: Int,):Int{
    var reminder=num1%num2
    return reminder
}
fun surName(name:String){
    var names="Hello"+ " "+ name
     println(names)
}
    fun nameOfboys(name: Array<String>){
    println(name.contentToString())
}


