name := "st-dom"
enablePlugins(ScalablyTypedConverterGenSourcePlugin)
useYarn := true
stOutputPackage := "dom"
stSourceGenMode := SourceGenMode.Manual(file("/workspace/st-dom/src/main/scala"))
stEnableLongApplyMethod := true
Compile / npmDependencies += "@types/jquery" -> "3.5.6"
stStdlib := List("es6", "dom")
stUseScalaJsDom := false