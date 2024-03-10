var flag: Boolean = true

fun main(args: Array<String>) {
    while (flag) {
        var command = readlnOrNull()?.split(" ")

        if (command != null) {
            if (command.size == 1) {
                when (command[0]) {
                    "exit" -> exit()
                    "help" -> help()
                    else -> println("Ошибка ввода!!!")
                }
            } else if (command.size == 4 && command[0] == "add") {
                when (command[2]) {
                    "phone" -> addPhone(command[3])
                    "email" -> addEmail(command[3])
                    else -> println("Ошибка ввода!!!")
                }
            } else {
                println("Ошибка ввода!!!")
            }
        }
    }
}

fun addPhone(phoneNumber: String) {
    if (isValidPhoneNumber(phoneNumber)){
        println("вызвана команда addPhone")
    }else{
        println("Ошибка ввода Phone number!!!")
    }
}

fun addEmail(email: String) {
    if (isValidEmail(email)){
        println("вызвана команда addEmail")
    }else{
        println("Ошибка ввода Email!!!")
    }
}

fun exit() {
    flag = false
}

fun help() {
    println("вызвана команда help")
}

fun isValidEmail(email: String): Boolean{
    return email.matches(Regex("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}"))
}

fun isValidPhoneNumber(phoneNumber: String): Boolean{
    return phoneNumber.matches(Regex("[0-9]+"))
}