/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import DatabaseConnection.DB;
import Models.BankAccountViewModel;
import Models.GameRoundViewModel;

/**
 *
 * @author aliha_000
 */
public class GameRoundRepository {

    public boolean Create(GameRoundViewModel vm) {
        boolean isSaved = true;
        try {
            String insertQry = "INSERT INTO GameRound(Date,Round) values ('" + vm.Date + "','" + vm.Round + "')";
            isSaved = DB.save(insertQry);
        } catch (Exception e) {
            isSaved = false;
            e.printStackTrace();
        }
        return isSaved;
    }
}
