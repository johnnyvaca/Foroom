package com.example.foroom.providers

import com.example.foroom.model.Category

interface IDataProvider {
    fun getCategoryById(id: Int): Category?
    fun saveCategory(category: Category)
}
