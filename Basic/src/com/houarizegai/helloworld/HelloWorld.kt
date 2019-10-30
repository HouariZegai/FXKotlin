package com.houarizegai.helloworld

import javafx.application.Application;
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.stage.Stage

class HelloWorld : Application() {

    override fun start(stage: Stage) {
        var btn = Button("Click me!")
        btn.styleClass.add("btn")

        var lbl = Label()

        var root = VBox(10.0)
        root.alignment = Pos.CENTER
        root.prefWidth = 200.0
        root.prefHeight = 200.0

        btn.setOnAction {
            lbl.text = "Hello World!"
        }

        root.children.addAll(btn, lbl)

        var scene = Scene(root)

        stage.scene = scene
        stage.scene.stylesheets.add("/com/houarizegai/helloworld/style.css")
        stage.title = "Hello World!"
        stage.show()
    }
}

fun main() {
    Application.launch(HelloWorld::class.java)
}
