package ru.gt2.rusref.fias;

import lombok.ToString;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Статус состояния домов.
 * Наличие плюсов с минусами в именах явно намекает на то, что помимо именования нужно ещё пару полей, да и из скобок сокращенеи лучше убрать.
 *
 * @author rage
 */
@ToString
public class HouseStateStatus {
    /**
     * Признак строения
     */
    @NotNull
    @Digits(integer = 10, fraction = 0)
    @XmlAttribute(name = "HOUSESTID", required = true)
    private Integer houseStId;

    /**
     * Наименование
     */
    @NotNull
    @Size(min = 1, max = 60)
    @XmlAttribute(name = "NAME", required = true)
    private String name;
}