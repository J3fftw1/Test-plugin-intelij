package com.github.j3fftw1.testpluginintelij.services

import com.intellij.openapi.project.Project
import com.github.j3fftw1.testpluginintelij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
