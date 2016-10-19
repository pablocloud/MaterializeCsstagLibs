package materializecsstaglibs

import grails.plugins.*

class MaterializeCssTagLibsGrailsPlugin extends Plugin {

    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "3.2.0 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/*",
            "grails-app/controllers/*"
    ]

    def title = "Materialize Css Tag Libs" // Headline display name of the plugin
    def author = "Pablo Verdugo Huerta"
    def authorEmail = "pabloverdugo@pabloverdugo.es"
    def description = 'This plugin will generate MaterializeCss via tagLibs.'
    def profiles = ['web']

    def documentation = "http://grails.org/plugin/materialize-css-tag-libs"

    Closure doWithSpring() {
        { ->
            // TODO Implement runtime spring config (optional)
        }
    }

    void doWithDynamicMethods() {
        // TODO Implement registering dynamic methods to classes (optional)
    }

    void doWithApplicationContext() {
        // TODO Implement post initialization spring config (optional)
    }

    void onChange(Map<String, Object> event) {
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    void onConfigChange(Map<String, Object> event) {
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    void onShutdown(Map<String, Object> event) {
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
