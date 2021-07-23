module consumer {
    /*
     * Here a description of the module is made, to create the module, when creating
     * the project, in the 2nd screen create a module and name the module.
     * 
     * To use the module, a require is needed: right click on the project ->
     * Properties -> Java Build Path -> ModulePath -> Add -> and select the modules
     * we need to use (The project needs to be opened)
     */
    requires service.provider;
    // as I use a logger, that is in another module, it needs to be required.
    // transitive modulator allows all modules that uses my modules need it too
    requires transitive java.logging;
}