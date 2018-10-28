package com.springinaction.knights;

import org.springframework.beans.factory.BeanNameAware;

public class BraveKnight implements Knight, BeanNameAware {
    private Quest quest;
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(("The name of the beam is " + name ));
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}