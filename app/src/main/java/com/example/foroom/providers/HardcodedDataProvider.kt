package com.example.foroom.providers
import android.util.Log
import com.example.foroom.model.Category

class HardcodedDataProvider : IDataProvider {

    var categories : MutableList<Category> = mutableListOf<Category>()

    init {
        Log.i ("XCL","DataProvider instanciated")
  //      categories.add(Category(1,"Consoles","de jeu"))
    //    categories.add(Category(2,"Ecrans","de malades"))
    }
    override fun getCategoryById(id: Int): Category? {
        var cat = Category()
        return cat  //categories.firstOrNull() { it.getId() == id }
    }

    override fun saveCategory(category: Category) {
        // Since it's a fake repository, I don't really save the user
        Log.i("FakeCategory", "Saved: $category")
    }
}
