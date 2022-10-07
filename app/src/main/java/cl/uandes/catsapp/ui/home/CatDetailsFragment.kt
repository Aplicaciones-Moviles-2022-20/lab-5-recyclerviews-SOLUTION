package cl.uandes.catsapp.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cl.uandes.catsapp.R
import cl.uandes.catsapp.databinding.FragmentCatDetailsBinding
import cl.uandes.catsapp.data.datasources.InMemoryDatasource

class CatDetailsFragment : Fragment() {

  private lateinit var binding: FragmentCatDetailsBinding

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?,
  ): View? {
    // Inflate the layout for this fragment
    binding = FragmentCatDetailsBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
//    find cat in InMemoryDataSource by name
    val cat = InMemoryDatasource.cats.find { it.name == arguments?.getString("catName") }
    binding.catNameTextView.text = cat?.name
    binding.catColorTextView.text = cat?.color
  }

}
