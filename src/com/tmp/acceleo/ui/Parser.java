package com.tmp.acceleo.ui;

import java.io.File;

import org.eclipse.emf.ecore.EPackage;

import com.sofrecom.codegen.CodegenPackage;
import java.util.Map;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Parser {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // BGI
        //Main.main(new String[]{"C:\\Users\\BGI6\\Dropbox\\JPATest\\model\\mymodel.xmi","./Output-gen"});
        Parser.registerPackages();
        Main.main(new String[]{new File("./").getAbsolutePath() + "\\model\\ViewModel.xmi", "./Output-gen"});
        //ZkGenerator.main(new String[]{"C:\\Users\\zied.Rassil-PC\\Dropbox\\JPATest\\model\\ViewModel.xmi","./Output-gen"});
    }


    public static void registerPackages() {
        EPackage.Registry.INSTANCE.put(CodegenPackage.eNS_URI, CodegenPackage.eINSTANCE);
        EPackage.Registry.INSTANCE.put("http://wwww.sofrecom.codegen", CodegenPackage.eINSTANCE);
//        ResourceSet rs = EPackage.Registry.INSTANCE
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

   
    }

}
