package com.workintech.s18d2.validation;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.exceptions.PlantException;
import org.springframework.http.HttpStatus;

public class PlantValidation {
    public static void validateFruit(Fruit fruit) {
        if (fruit.getName() == null || fruit.getName().trim().isEmpty()) {
            throw new PlantException("Fruit name cannot be null or empty", HttpStatus.BAD_REQUEST);
        }
        if (fruit.getPrice() == null || fruit.getPrice() <= 0) {
            throw new PlantException("Fruit price must be greater than 0", HttpStatus.BAD_REQUEST);
        }
        if (fruit.getFruitType() == null) {
            throw new PlantException("Fruit type cannot be null", HttpStatus.BAD_REQUEST);
        }
    }

    public static void validateVegetable(Vegetable vegetable) {
        if (vegetable.getName() == null || vegetable.getName().trim().isEmpty()) {
            throw new PlantException("Vegetable name cannot be null or empty", HttpStatus.BAD_REQUEST);
        }
        if (vegetable.getPrice() == null || vegetable.getPrice() <= 0) {
            throw new PlantException("Vegetable price must be greater than 0", HttpStatus.BAD_REQUEST);
        }
        if (vegetable.getGrownOnTree() == null) {
            throw new PlantException("grownOnTree cannot be null", HttpStatus.BAD_REQUEST);
        }
    }

    public static void validateId(Long id) {
        if (id == null || id <= 0) {
            throw new PlantException("Id must be greater than 0", HttpStatus.BAD_REQUEST);
        }
    }
}