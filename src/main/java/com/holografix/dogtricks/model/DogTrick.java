package com.holografix.dogtricks.model;

import java.util.Arrays;
import java.util.List;

public record DogTrick(int id, String name, String description) {

    private static List<DogTrick> tricks = Arrays.asList(
            new DogTrick(0, "Sit", "The dog sits down."),
            new DogTrick(1, "Roll Over", "The dog rolls over."),
            new DogTrick(2, "Fetch", "The dog fetches an item."),
            new DogTrick(3, "Stay", "The dog stays in place."),
            new DogTrick(4, "Come", "The dog comes to the owner."),
            new DogTrick(5, "Paw", "The dog gives its paw."),
            new DogTrick(6, "Heel", "The dog walks right beside its owner."),
            new DogTrick(7, "Play Dead", "The dog lies down and stays still as if it were dead."),
            new DogTrick(8, "Spin", "The dog spins around in a circle."),
            new DogTrick(9, "Bark on Command", "The dog barks when a specific command is given."),
            new DogTrick(10, "Jump", "The dog jumps over an obstacle or in place."),
            new DogTrick(11, "Back Up", "The dog walks backwards."),
            new DogTrick(12, "Shake Hands", "The dog lifts a paw to 'shake hands' with a person."),
            new DogTrick(13, "Crawl", "The dog moves forward while staying low to the ground."),
            new DogTrick(14, "Bow", "The dog lowers its front legs and keeps its rear end up."),
            new DogTrick(15, "Find It", "The dog finds a hidden object or treat."),
            new DogTrick(16, "Kiss", "The dog gently touches its nose to a person's cheek or hand."),
            new DogTrick(17, "Wave", "The dog lifts a paw to wave goodbye or hello."),
            new DogTrick(18, "Speak", "The dog vocalizes on command."),
            new DogTrick(19, "Quiet", "The dog stops barking on command."),
            new DogTrick(20, "Roll in a Blanket", "The dog rolls itself up in a blanket."));

    public static DogTrick getById(int id) {
        return tricks.stream().filter(trick -> trick.id() == id).findFirst().orElse(null);
    }

    public static List<DogTrick> getAllTricks() {
        return tricks;
    }
}