package com.basicspring;

public class BraveKnight implements Knight {
    Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void doQuest() {
        quest.focus();
    }
}