package starwarskotlin.devhernand.com.br.starwarskotlin

import kotlin.reflect.KProperty


/**
 * Created by Hernand Azevedo on 10/19/17.
 * Copyright (c) 2017 Stone Payments. All rights reserved.
 **/
class NotNullSingleValueVar<T> {
    private var value: T? = null;
    operator fun getValue(thisRef: Any?,property: KProperty<*>) : T{
        return value ?: throw IllegalStateException("${property.name} "+" not initialized")
    }
    operator fun setValue(thisRef: Any?,property: KProperty<*>,value: T){
        this.value = if(this.value == null) value
        else throw IllegalStateException("${property.name} "+" alredy initialized")
    }
}