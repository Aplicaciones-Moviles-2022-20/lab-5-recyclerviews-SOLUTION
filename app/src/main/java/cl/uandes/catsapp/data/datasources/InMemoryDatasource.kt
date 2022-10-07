package cl.uandes.catsapp.data.datasources

import cl.uandes.catsapp.data.model.Cat

object InMemoryDatasource {
  val cats = mutableListOf<Cat>(
    Cat("Toto", "negro"),
    Cat("Luna", "blanco")
  )
}
