package br.az.dokkatest

/**
 * @author Namig Gadirov
 * Email: namiqqedirov01@gmail.com, namig.gadirov@bankrespublika.az
 * Copyright. All rights reserved
 * @param mainData send as a parameter
 * @constructor Create an object
 */
class Object(internal var mainData: String) {

    /**
     * This method shows parameters input and output
     * @param input gets data from calling
     * @return String as "output"
     */
    fun parametersWithReturn(input: String): String {
        val output = "output"
        return output
    }

    /**
     * This method throws Exception
     * @throws Exception
     */
    fun exceptionThrow(): Exception {
        throw Exception()
    }

    /**
     * @since 5.5.8.5
     * @return String as a parameter
     */
    fun versionAndSince(): String {
        return "String"
    }
}