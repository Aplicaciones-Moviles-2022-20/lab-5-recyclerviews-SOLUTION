package cl.uandes.catsapp.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import cl.uandes.catsapp.R
import cl.uandes.catsapp.data.datasources.InMemoryDatasource
import cl.uandes.catsapp.data.model.Cat
import cl.uandes.catsapp.databinding.FragmentCatListBinding

class CatListFragment : Fragment(), CatItemAdapter.ActionListener {

  private lateinit var catItemAdapter: CatItemAdapter
  private lateinit var binding: FragmentCatListBinding
  private var allCats = InMemoryDatasource.cats

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?,
  ): View? {
    catItemAdapter = CatItemAdapter(allCats, this)
    binding = FragmentCatListBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    val catListView = binding.recyclerView
    // TODO 5: en la siguiente línea se agrega un LinearLayoutManager
    // al LayoutManager del RecyclerView que contendrá nuestra lista de
    // Cats. Describe en el README los pasos a seguir para que el
    //  Recyclerview muestre un Grid en vez de una lista.
    // Hint: te puede servir leer este link
    // https://pasindulaksara.medium.com/recyclerview-with-grid-layout-in-kotlin-414d780c47ae
    catListView.layoutManager = LinearLayoutManager(context)
    catListView.adapter = catItemAdapter
  }

  override fun goToCatDetails(cat: Cat) {
    val bundle = bundleOf("catName" to cat.name)
    findNavController().navigate(R.id.action_catListFragment_to_catDetailsFragment, bundle)
  }


}
