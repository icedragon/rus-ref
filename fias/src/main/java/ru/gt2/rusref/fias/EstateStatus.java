package ru.gt2.rusref.fias;

import lombok.ToString;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Признак владения.
 *
 * @author rage
 */
@ToString
public class EstateStatus {
    /**
     * Признак строения
     */
    @NotNull
    @Digits(integer = 10, fraction = 0)
    @XmlAttribute(name = "ESTSTATID", required = true)
    private Integer estStatId;

    /**
     * Наименование
     */
    @NotNull
    @Size(min = 1, max = 20)
    @XmlAttribute(name = "NAME", required = true)
    private String name;

    /**
     * Краткое наименование
     */
    @Size(min = 1, max = 20)
    @XmlAttribute(name = "SHORTNAME")
    private String shortName;

}