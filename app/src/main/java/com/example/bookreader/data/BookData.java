package com.example.bookreader.data;

import com.example.bookreader.R;
import com.example.bookreader.model.BookModel;

import java.util.ArrayList;

public class BookData {


    public static ArrayList<BookModel> getBookData() {

        ArrayList<BookModel> bookList = new ArrayList<BookModel>();

        BookModel bookModel1 = new BookModel("Cach Nghi De Thanh Cong", "Napoleon Hill",R.drawable.cachnghidethanhcong);
        BookModel bookModel2 = new BookModel("Cuoc song Khong Gioi Han", "Nick Vujicic",R.drawable.cuocsongkhonggioihan);
        BookModel bookModel3 = new BookModel("Dac Nhan Tam", "Dale Carnegie",R.drawable.dacnhantam);
        BookModel bookModel4 = new BookModel("Hanh trinh ve phuong dong", "Blair T.Spalding",R.drawable.hanhtrinhvephuongdong);
        BookModel bookModel5 = new BookModel("Hat Giong Tam Hon", "Mutliple Author",R.drawable.hatgiongtamhon);
        BookModel bookModel6 = new BookModel("Nguoi Giau co nhat tai Thanh Babylon", "Geogre S.Classon",R.drawable.nguoigiauconhatthanhbabylon);

        bookList.add(bookModel1);
        bookList.add(bookModel2);
        bookList.add(bookModel3);
        bookList.add(bookModel4);
        bookList.add(bookModel5);
        bookList.add(bookModel6);

        return bookList;
    }

}
