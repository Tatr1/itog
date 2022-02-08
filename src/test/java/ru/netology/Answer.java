package ru.netology;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class Answer {
    private final SelenideElement successPay = $(withText("Успешно"));
    private final SelenideElement failurePay = $(withText("Ошибка"));
    private final SelenideElement failureCard = $(withText("Истёк срок действия карты"));
    private final SelenideElement failureMounthOrYear = $(withText("Неверно указан срок действия карты"));
    private final SelenideElement failureCvc = $(withText("Неверный формат"));
    private final SelenideElement failureZerofield = $(withText("Поле обязательно для заполнения"));
}
