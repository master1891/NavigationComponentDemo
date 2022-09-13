package com.nels.navigationcomponentdemo.fragments

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class GameModeDialog : DialogFragment() {


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        //return super.onCreateDialog(savedInstanceState)
        val gameModeOptions = arrayOf("Modo 1","Modo 2","Modo 3","Modo 4")
        var optionSelected = gameModeOptions[0]

        return activity?.let {
            val builder = AlertDialog.Builder(it)

            builder.setTitle("Dialogo de prueba")
                .setSingleChoiceItems(gameModeOptions,0) { dialogInterface, i ->
                    optionSelected = gameModeOptions[0]

                }.setPositiveButton("ACEPTAR") { dialog, id ->

                }.setNegativeButton("CANCELAR"){ dialog, id ->
                    dialog.dismiss()
                }
            builder.create()
        }?: throw IllegalStateException("Activity n opuede ser nulo")


    }

}