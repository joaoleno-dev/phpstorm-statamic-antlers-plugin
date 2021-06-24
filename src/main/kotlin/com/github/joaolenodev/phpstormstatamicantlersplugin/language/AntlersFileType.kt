package com.github.joaolenodev.phpstormstatamicantlersplugin.language

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader

val AntlersIcon = IconLoader.getIcon("/icons/statamic.svg");

object AntlersFileType : LanguageFileType(Antlers) {
    override fun getName() = "Antlers File"
    override fun getDescription() = "Antlers Template Language file"
    override fun getDefaultExtension(): String {
        return "antlers.html"
    }

    override fun getIcon() = AntlersIcon

}