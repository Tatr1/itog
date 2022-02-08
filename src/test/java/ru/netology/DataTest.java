package ru.netology;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DataTest {


 @Test
    void shouldPayActiveCard(){
     open("http://localhost:8080");
     //final SelenideElement buttonPay = $$("[role='button']").find(text("Купить")).click();
     //void SelenideElement buttonPay = $$("[role='button']").filter(visible).find(text("Купить")).click();
  $$("[role='button']").filter(visible).find(text("Купить")).click();
     final SelenideElement numberCard = $$(".input__inner").findBy(text("Номер карты")).$(".input__control").setValue(AuthInfo.getNumberApproved());
     final SelenideElement cardMounth = $$(".input__inner").findBy(text("Месяц")).$(".input__control").setValue(DataGenerator.generateMounth(1));
     final SelenideElement cardYear = $$(".input__inner").findBy(text("Год")).$(".input__control").setValue(DataGenerator.generateYear(1));
     final SelenideElement cardHolder = $$(".input__inner").findBy(text("Владелец")).$(".input__control").setValue(DataGenerator.generateName());
     final SelenideElement cardCvc = $$(".input__inner").findBy(text("CVC/CVV")).$(".input__control").setValue(DataGenerator.generateCvc());
     $$("[role='button']").find(text("Продолжить")).click();
     $(".notification_status_ok").shouldHave(text("Успешно"), Duration.ofSeconds(30));
 }

    @Test
    void shouldPayPassiveCard(){
        open("http://localhost:8080");
        $$("[role='button']").filter(visible).find(text("Купить")).click();
        final SelenideElement numberCard = $$(".input__inner").findBy(text("Номер карты")).$(".input__control").setValue(AuthInfo.getNumberFake());
        final SelenideElement cardMounth = $$(".input__inner").findBy(text("Месяц")).$(".input__control").setValue(DataGenerator.generateMounth(1));
        final SelenideElement cardYear = $$(".input__inner").findBy(text("Год")).$(".input__control").setValue(DataGenerator.generateYear(1));
        final SelenideElement cardHolder = $$(".input__inner").findBy(text("Владелец")).$(".input__control").setValue(DataGenerator.generateName());
        final SelenideElement cardCvc = $$(".input__inner").findBy(text("CVC/CVV")).$(".input__control").setValue(DataGenerator.generateCvc());
        $$("[role='button']").find(text("Продолжить")).click();
        //  final SelenideElement buttonEnd = $(byText("Продолжить")).click();
        //   $$(".notification__title").shouldBe().filter(visible).find(text("Ошибка. Банк отказал в проведении операции"));
        $(".notification_status_error").shouldHave(text("Ошибка"), Duration.ofSeconds(30));
   }

 }




