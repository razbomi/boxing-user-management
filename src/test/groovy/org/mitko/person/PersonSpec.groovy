package org.mitko.person

import spock.lang.Specification

class PersonSpeck extends Specification {

    def "calculate persons age"() {
        given:
            Person person = new Person();
        when:
            int age = person.age();
        then:
            age == 24
    }
}