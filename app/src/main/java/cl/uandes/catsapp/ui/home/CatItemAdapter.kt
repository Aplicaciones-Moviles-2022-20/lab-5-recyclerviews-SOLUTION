package cl.uandes.catsapp.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import cl.uandes.catsapp.R
import cl.uandes.catsapp.data.model.Cat

class CatItemAdapter(
  private val cats: MutableList<Cat>,
  private val actionListener: ActionListener
) : RecyclerView.Adapter<CatItemAdapter.ViewHolder>() {

  inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val catItem = itemView.findViewById<ViewGroup>(R.id.catItem)
    val catName = itemView.findViewById<TextView>(R.id.catName_textView_item)
    //TODO 2: agrega el atributo agregado a continuación. Recuerda agregar un
    // textView en el archivo cat_item.xml para que puedas visualizarlo
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    // TODO 3: explica con tus palabras lo que ocurre en las siguientes tres lineas
    // de código. Recuerda escribirlo en el archivo README.md
    val context = parent.context
    val inflater = LayoutInflater.from(context)
    val catItemView: View = inflater.inflate(R.layout.cat_item, parent, false)

    return ViewHolder(catItemView)
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val cat: Cat = cats[position]

    val name = holder.catName
    val detailsButton = holder.catItem
    // TODO 4: escribe el atributo que agregaste aquí
    // luego, haz que obtenga el valor que contiene el
    // atributo del objeto "cat"

    name.text = cat.name

    detailsButton.setOnClickListener {
      actionListener.goToCatDetails(cat)
    }
  }
  override fun getItemCount(): Int {
    return cats.size
  }

  interface ActionListener {
    fun goToCatDetails(cat: Cat)
  }
}
