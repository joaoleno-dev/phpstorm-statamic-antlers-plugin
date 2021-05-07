package com.github.joaolenodev.phpstormstatamicantlersplugin.services

import com.github.joaolenodev.phpstormstatamicantlersplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
