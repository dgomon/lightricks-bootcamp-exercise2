package com.lightricks.exercise2

import android.content.Context
import android.opengl.GLSurfaceView

class MyGLSurfaceView(context: Context) : GLSurfaceView(context) {

    private val renderer: MyGLRenderer

    init {
        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2)

        renderer = MyGLRenderer()

        // Render the view only when there is a change in the drawing data.
        // To allow the triangle to rotate automatically, this line is commented out:
        // renderMode = RENDERMODE_WHEN_DIRTY

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(renderer)
    }
}
