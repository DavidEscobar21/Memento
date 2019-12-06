class Memento{

     var estado: String

    constructor(estado: String) {
        this.estado = estado
    }


}

class Persona{

     var Nombre: String

    constructor(Nombre: String) {
        this.Nombre = Nombre
    }

    fun guardar():Memento{
        println("originator: guardando memento...")
        return Memento(Nombre)
    }
}


class Caretaker{

    var estados = ArrayList<Memento>()

    fun  getMemento(index:Int):Memento{

        return estados.get(index)

    }

    fun agregarMemento(m: Memento){

        estados.add(m)
    }


}

    fun main(args:Array<String>) {

        val caretaker = Caretaker()
        var persona = Persona("")

        persona.Nombre = "David"

        persona.Nombre = "Andrew"
        caretaker.agregarMemento(persona.guardar())

        persona.Nombre = "Miriam"
        caretaker.agregarMemento(persona.guardar())

        persona.Nombre = "Wos"
        println(persona.Nombre)

        persona.Nombre = "Luis"

        var m1:Memento = caretaker.getMemento(0)
        println(m1.estado)

        var m2:Memento = caretaker.getMemento(1)
        println(m2.estado)

    }


