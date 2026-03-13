package org.example

class stringtools implements Serializable {
    static String tag(String branch, String build){
        return "${branch}-${build}"
    }    
}