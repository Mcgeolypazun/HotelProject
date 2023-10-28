package sunghyuk;

public class PaymentView {

    Hotel hotel = new Hotel();

    PaymentView(){

    }


    public boolean moneyComparison(int custMoney,int roomFee){
        if(custMoney >= roomFee){
            hotel.setHotelAsset(custMoney - roomFee); // 호텔 자산 변동
            //고객 자산 변동
            //MainView로 이동
            return true;
        }
        else{//소지금 부족

            return false;
        }

    }

    public void reservationNumber(){//호텔과 고객에게 uuid 할당함

    }

}

