package sample;

import cn.hyperchain.contract.BaseContractInterface;

/**
 * Author: hyperchain
 * Package: sample
 * Description: an alternative interface used to be delivered to application
 */
public interface ISBank2 extends BaseContractInterface {
    boolean transfer(String from, String to, int value);
    boolean withdraw(String from, int val);
    boolean deposit(String from, int val);
}
