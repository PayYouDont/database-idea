package com.github.payyoudont.databaseidea.services

import com.github.payyoudont.databaseidea.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
