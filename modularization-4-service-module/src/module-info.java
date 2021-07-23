module service.provider {
    /*
     * Here a description of the module is made, to create the module, when creating
     * the project, in the 2nd screen create a module and name the module.
     * 
     * To use the module, a require is needed: right click on the project ->
     * Properties -> Java Build Path -> ModulePath -> Add -> and select the modules
     * we need to use (The project needs to be opened)
     */

    // Now I export only the packages I want to be used and only that, perfectioning
    // encapsulation
    exports sorting.util;
}