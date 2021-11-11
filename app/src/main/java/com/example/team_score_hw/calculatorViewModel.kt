package com.example.team_score_hw

import androidx.lifecycle.ViewModel


class calculatorViewModel : ViewModel() {

    /**
     * we want protects the app data inside the ViewModel
     * from unwanted and unsafe changes by external classes,
     * but it allows external callers to safely access its value so we do like this.
     * //
     * default visibility modifier in Kotlin is public,
     * so count is public and accessible from other classes.
     * //
     * get() method is being overridden, this property is immutable and read-only.
     * When an outside class accesses this property, it returns the value of _number and its value can't be modified.
     */

    private var _number = 0
    val number : Int
    get() = _number

    // operations
    fun addPoint(){
        _number++
    }

    fun subtractPoints(){
        _number -=2
    }

    fun addFourPoints(){
        _number +=4
    }

}