package top.liuergo.observer.builtin;

import lombok.Data;

import java.util.Observable;

/**
 * @author liuergo
 * @description 明星Kunkun
 * @date 2019-11-21 11:36
 */

@Data
public class Kunkun extends Observable {
    String message;

    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);

    }
    public void sendMessage(String message) {
        this.message = message;
        notifyObservers(this.message);
    }
}
