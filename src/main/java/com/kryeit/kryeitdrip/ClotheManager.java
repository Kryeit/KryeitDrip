package com.kryeit.kryeitdrip;

import com.kryeit.kryeitdrip.util.SkinUtil;
import me.lucko.fabric.api.permissions.v0.Permissions;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.ArrayList;
import java.util.List;

public class ClotheManager {
    private final List<Clothe> clothesList;
    private static ClotheManager instance;

    private ClotheManager() {
        this.clothesList = new ArrayList<>();
        this.addClothe(Clothe.hoodie());
    }

    public static ClotheManager getInstance() {
        if (instance == null) {
            instance = new ClotheManager();
        }
        return instance;
    }

    public void addClothe(Clothe clothe) {
        this.clothesList.add(clothe);
    }

    public List<Clothe> getClothesList() {
        return clothesList;
    }

    public void equipClothe(ServerPlayerEntity player, Clothe clothe) {
        if (Permissions.check(player, clothe.getPermission(), true)) {
            // Apply the clothing overlay
            SkinUtil.applyClothingOverlay(player, clothe.getName());
        }
    }
}