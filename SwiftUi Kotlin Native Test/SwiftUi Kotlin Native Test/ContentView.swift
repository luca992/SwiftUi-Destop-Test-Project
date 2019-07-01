//
//  ContentView.swift
//  SwiftUi Kotlin Native Test
//
//  Created by Luca Spinazzola on 7/1/19.
//  Copyright © 2019 3Good LLC. All rights reserved.
//

import SwiftUI
import SwiftUi_Destop_Test_Project

struct ContentView : View {
    let names = NamesSupplier().listOfNames
    var body: some View {
        Text(names[0])
    }
}

#if DEBUG
struct ContentView_Previews : PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
#endif
