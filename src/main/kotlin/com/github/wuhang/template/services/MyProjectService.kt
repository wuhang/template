package com.github.wuhang.template.services

import com.intellij.openapi.project.Project
import com.github.wuhang.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
