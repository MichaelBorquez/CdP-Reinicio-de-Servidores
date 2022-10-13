<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>form_CDATAvar theForm  document.formsfrmif _fc082b</name>
   <tag></tag>
   <elementGuidId>1300faca-eb09-4e44-98f8-80ea4285e90d</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//form[@id='frm']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#frm</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>form</value>
      <webElementGuid>1939e136-f9ec-4af1-a62e-006807ea861d</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>name</name>
      <type>Main</type>
      <value>frm</value>
      <webElementGuid>024ea9e3-9174-4ff1-b1b5-8127299b1c6b</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>method</name>
      <type>Main</type>
      <value>post</value>
      <webElementGuid>6207ba43-7be9-4a7d-b692-c0b3189cc1a4</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>action</name>
      <type>Main</type>
      <value>./PRO_ProcesoEjecucion.aspx?PID=128941&amp;USUARIOID=10073&amp;ESTADO=1&amp;DTE=DTE</value>
      <webElementGuid>575f0a71-c77a-416c-a81e-0a3e2846bec5</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>frm</value>
      <webElementGuid>c86df00c-a72f-41ca-aa53-af3f381c8096</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>







//&lt;![CDATA[
var theForm = document.forms['frm'];
if (!theForm) {
    theForm = document.frm;
}
function __doPostBack(eventTarget, eventArgument) {
    if (!theForm.onsubmit || (theForm.onsubmit() != false)) {
        theForm.__EVENTTARGET.value = eventTarget;
        theForm.__EVENTARGUMENT.value = eventArgument;
        theForm.submit();
    }
}
//]]>





	
	

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
            
                
                    
                        
                            
                                
                                    Documentos
                                    -
                                    Generación de DTE  
                            
                            
                        
                        
                            Ciclo:
                            
                                288
                            
                            Lote:

                            
                                1
                            
                        
                        
                            Alcance:
                            
                                Ciclo  288 -  Lote  1
                            
                            A Procesar:
                            Etapa:
                            
                                0 de 0
                            
                        
                        
                            Inicio:
                            
                                
                            
                            Fin:
                            
                                
                            
                        
                        
                            Procesados:
                            
                                0
                            
                            Tiempo:
                            
                                00:00:00
                            
                        
                        
                            Usuario:
                            
                                GONZALEZ GUTIERREZ LUIS MARCELO
                            
                            Errores:
                            
                                0
                            
                        
                        
                            Estado:
                            
                                Inicial
                            
                             
                             
                        
                        
                            
                                
                                    0%
                                
                            
                        
                    
                    
                        
                            
                            
                                
	
		
			
		Guardar DTE
	

&lt;!--
aspxAddHoverItems('xbtnGuardarDTE',[[['dxbButtonHover_Office2010Blue'],[''],[''],['','TC']]]);
aspxAddPressedItems('xbtnGuardarDTE',[[['dxbButtonPressed_Office2010Blue'],[''],[''],['','TC']]]);
aspxAddDisabledItems('xbtnGuardarDTE',[[['dxbDisabled_Office2010Blue'],[''],[''],['','TC']]]);

var dxo = new ASPxClientButton('xbtnGuardarDTE');
window['xbtnGuardarDTE'] = dxo;
dxo.autoPostBack = true;
dxo.clientEnabled = false;
dxo.Click.AddHandler(exportar);
dxo.allowFocus = false;
dxo.AfterCreate();

//-->

                            
                            
                                
	
		
			
		Guardar Inserto
	

&lt;!--
aspxAddHoverItems('xbtnGuardarInserto',[[['dxbButtonHover_Office2010Blue'],[''],[''],['','TC']]]);
aspxAddPressedItems('xbtnGuardarInserto',[[['dxbButtonPressed_Office2010Blue'],[''],[''],['','TC']]]);
aspxAddDisabledItems('xbtnGuardarInserto',[[['dxbDisabled_Office2010Blue'],[''],[''],['','TC']]]);

var dxo = new ASPxClientButton('xbtnGuardarInserto');
window['xbtnGuardarInserto'] = dxo;
dxo.autoPostBack = true;
dxo.clientEnabled = false;
dxo.Click.AddHandler(exportar);
dxo.allowFocus = false;
dxo.AfterCreate();

//-->

                            
                        
                    
                
                
                    
                        
	
		
			
		Aceptar
	

&lt;!--
aspxAddHoverItems('xbtnAceptar',[[['dxbButtonHover_Office2010Blue'],[''],[''],['','TC']]]);
aspxAddPressedItems('xbtnAceptar',[[['dxbButtonPressed_Office2010Blue'],[''],[''],['','TC']]]);
aspxAddDisabledItems('xbtnAceptar',[[['dxbDisabled_Office2010Blue'],[''],[''],['','TC']]]);

var dxo = new ASPxClientButton('xbtnAceptar');
window['xbtnAceptar'] = dxo;
dxo.autoPostBack = true;
dxo.clientVisible = false;
dxo.Click.AddHandler(Aceptar);
dxo.allowFocus = false;
dxo.AfterCreate();

//-->

                        
	
		
			
		Ejecutar
	

&lt;!--
aspxAddHoverItems('xbtnEjecutar',[[['dxbButtonHover_Office2010Blue'],[''],[''],['','TC']]]);
aspxAddPressedItems('xbtnEjecutar',[[['dxbButtonPressed_Office2010Blue'],[''],[''],['','TC']]]);
aspxAddDisabledItems('xbtnEjecutar',[[['dxbDisabled_Office2010Blue'],[''],[''],['','TC']]]);

var dxo = new ASPxClientButton('xbtnEjecutar');
window['xbtnEjecutar'] = dxo;
dxo.autoPostBack = true;
dxo.Click.AddHandler(ejecutar);
dxo.allowFocus = false;
dxo.AfterCreate();

//-->

                    
                    
                        
	
		
			
		Cancelar
	

&lt;!--
aspxAddHoverItems('xbtnCancelar',[[['dxbButtonHover_Office2010Blue'],[''],[''],['','TC']]]);
aspxAddPressedItems('xbtnCancelar',[[['dxbButtonPressed_Office2010Blue'],[''],[''],['','TC']]]);
aspxAddDisabledItems('xbtnCancelar',[[['dxbDisabled_Office2010Blue'],[''],[''],['','TC']]]);

var dxo = new ASPxClientButton('xbtnCancelar');
window['xbtnCancelar'] = dxo;
dxo.autoPostBack = true;
dxo.Click.AddHandler(cancelar);
dxo.allowFocus = false;
dxo.AfterCreate();

//-->

                    

                    
                    
                        
	
		
			
		Errores
	

&lt;!--
aspxAddHoverItems('xbtnErrores',[[['dxbButtonHover_Office2010Blue'],[''],[''],['','TC']]]);
aspxAddPressedItems('xbtnErrores',[[['dxbButtonPressed_Office2010Blue'],[''],[''],['','TC']]]);
aspxAddDisabledItems('xbtnErrores',[[['dxbDisabled_Office2010Blue'],[''],[''],['','TC']]]);

var dxo = new ASPxClientButton('xbtnErrores');
window['xbtnErrores'] = dxo;
dxo.autoPostBack = true;
dxo.clientEnabled = false;
dxo.Click.AddHandler(verErrores);
dxo.allowFocus = false;
dxo.AfterCreate();

//-->

                    
                
            
        
    </value>
      <webElementGuid>530bc52b-9edc-4f50-8a55-678358a9206b</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;frm&quot;)</value>
      <webElementGuid>f5d3cc4d-5ac6-4f2e-85bb-2a46be86ae47</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//form[@id='frm']</value>
      <webElementGuid>52141cfa-19e5-499b-8f7c-28279683a7e9</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//form</value>
      <webElementGuid>ced9da4f-2d04-4244-beaf-d1b18f5245aa</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//form[@name = 'frm' and @id = 'frm' and (text() = concat(&quot;







//&lt;![CDATA[
var theForm = document.forms[&quot; , &quot;'&quot; , &quot;frm&quot; , &quot;'&quot; , &quot;];
if (!theForm) {
    theForm = document.frm;
}
function __doPostBack(eventTarget, eventArgument) {
    if (!theForm.onsubmit || (theForm.onsubmit() != false)) {
        theForm.__EVENTTARGET.value = eventTarget;
        theForm.__EVENTARGUMENT.value = eventArgument;
        theForm.submit();
    }
}
//]]>





	
	

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
            
                
                    
                        
                            
                                
                                    Documentos
                                    -
                                    Generación de DTE  
                            
                            
                        
                        
                            Ciclo:
                            
                                288
                            
                            Lote:

                            
                                1
                            
                        
                        
                            Alcance:
                            
                                Ciclo  288 -  Lote  1
                            
                            A Procesar:
                            Etapa:
                            
                                0 de 0
                            
                        
                        
                            Inicio:
                            
                                
                            
                            Fin:
                            
                                
                            
                        
                        
                            Procesados:
                            
                                0
                            
                            Tiempo:
                            
                                00:00:00
                            
                        
                        
                            Usuario:
                            
                                GONZALEZ GUTIERREZ LUIS MARCELO
                            
                            Errores:
                            
                                0
                            
                        
                        
                            Estado:
                            
                                Inicial
                            
                             
                             
                        
                        
                            
                                
                                    0%
                                
                            
                        
                    
                    
                        
                            
                            
                                
	
		
			
		Guardar DTE
	

&lt;!--
aspxAddHoverItems(&quot; , &quot;'&quot; , &quot;xbtnGuardarDTE&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonHover_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddPressedItems(&quot; , &quot;'&quot; , &quot;xbtnGuardarDTE&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonPressed_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddDisabledItems(&quot; , &quot;'&quot; , &quot;xbtnGuardarDTE&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbDisabled_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);

var dxo = new ASPxClientButton(&quot; , &quot;'&quot; , &quot;xbtnGuardarDTE&quot; , &quot;'&quot; , &quot;);
window[&quot; , &quot;'&quot; , &quot;xbtnGuardarDTE&quot; , &quot;'&quot; , &quot;] = dxo;
dxo.autoPostBack = true;
dxo.clientEnabled = false;
dxo.Click.AddHandler(exportar);
dxo.allowFocus = false;
dxo.AfterCreate();

//-->

                            
                            
                                
	
		
			
		Guardar Inserto
	

&lt;!--
aspxAddHoverItems(&quot; , &quot;'&quot; , &quot;xbtnGuardarInserto&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonHover_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddPressedItems(&quot; , &quot;'&quot; , &quot;xbtnGuardarInserto&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonPressed_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddDisabledItems(&quot; , &quot;'&quot; , &quot;xbtnGuardarInserto&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbDisabled_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);

var dxo = new ASPxClientButton(&quot; , &quot;'&quot; , &quot;xbtnGuardarInserto&quot; , &quot;'&quot; , &quot;);
window[&quot; , &quot;'&quot; , &quot;xbtnGuardarInserto&quot; , &quot;'&quot; , &quot;] = dxo;
dxo.autoPostBack = true;
dxo.clientEnabled = false;
dxo.Click.AddHandler(exportar);
dxo.allowFocus = false;
dxo.AfterCreate();

//-->

                            
                        
                    
                
                
                    
                        
	
		
			
		Aceptar
	

&lt;!--
aspxAddHoverItems(&quot; , &quot;'&quot; , &quot;xbtnAceptar&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonHover_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddPressedItems(&quot; , &quot;'&quot; , &quot;xbtnAceptar&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonPressed_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddDisabledItems(&quot; , &quot;'&quot; , &quot;xbtnAceptar&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbDisabled_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);

var dxo = new ASPxClientButton(&quot; , &quot;'&quot; , &quot;xbtnAceptar&quot; , &quot;'&quot; , &quot;);
window[&quot; , &quot;'&quot; , &quot;xbtnAceptar&quot; , &quot;'&quot; , &quot;] = dxo;
dxo.autoPostBack = true;
dxo.clientVisible = false;
dxo.Click.AddHandler(Aceptar);
dxo.allowFocus = false;
dxo.AfterCreate();

//-->

                        
	
		
			
		Ejecutar
	

&lt;!--
aspxAddHoverItems(&quot; , &quot;'&quot; , &quot;xbtnEjecutar&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonHover_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddPressedItems(&quot; , &quot;'&quot; , &quot;xbtnEjecutar&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonPressed_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddDisabledItems(&quot; , &quot;'&quot; , &quot;xbtnEjecutar&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbDisabled_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);

var dxo = new ASPxClientButton(&quot; , &quot;'&quot; , &quot;xbtnEjecutar&quot; , &quot;'&quot; , &quot;);
window[&quot; , &quot;'&quot; , &quot;xbtnEjecutar&quot; , &quot;'&quot; , &quot;] = dxo;
dxo.autoPostBack = true;
dxo.Click.AddHandler(ejecutar);
dxo.allowFocus = false;
dxo.AfterCreate();

//-->

                    
                    
                        
	
		
			
		Cancelar
	

&lt;!--
aspxAddHoverItems(&quot; , &quot;'&quot; , &quot;xbtnCancelar&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonHover_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddPressedItems(&quot; , &quot;'&quot; , &quot;xbtnCancelar&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonPressed_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddDisabledItems(&quot; , &quot;'&quot; , &quot;xbtnCancelar&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbDisabled_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);

var dxo = new ASPxClientButton(&quot; , &quot;'&quot; , &quot;xbtnCancelar&quot; , &quot;'&quot; , &quot;);
window[&quot; , &quot;'&quot; , &quot;xbtnCancelar&quot; , &quot;'&quot; , &quot;] = dxo;
dxo.autoPostBack = true;
dxo.Click.AddHandler(cancelar);
dxo.allowFocus = false;
dxo.AfterCreate();

//-->

                    

                    
                    
                        
	
		
			
		Errores
	

&lt;!--
aspxAddHoverItems(&quot; , &quot;'&quot; , &quot;xbtnErrores&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonHover_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddPressedItems(&quot; , &quot;'&quot; , &quot;xbtnErrores&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonPressed_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddDisabledItems(&quot; , &quot;'&quot; , &quot;xbtnErrores&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbDisabled_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);

var dxo = new ASPxClientButton(&quot; , &quot;'&quot; , &quot;xbtnErrores&quot; , &quot;'&quot; , &quot;);
window[&quot; , &quot;'&quot; , &quot;xbtnErrores&quot; , &quot;'&quot; , &quot;] = dxo;
dxo.autoPostBack = true;
dxo.clientEnabled = false;
dxo.Click.AddHandler(verErrores);
dxo.allowFocus = false;
dxo.AfterCreate();

//-->

                    
                
            
        
    &quot;) or . = concat(&quot;







//&lt;![CDATA[
var theForm = document.forms[&quot; , &quot;'&quot; , &quot;frm&quot; , &quot;'&quot; , &quot;];
if (!theForm) {
    theForm = document.frm;
}
function __doPostBack(eventTarget, eventArgument) {
    if (!theForm.onsubmit || (theForm.onsubmit() != false)) {
        theForm.__EVENTTARGET.value = eventTarget;
        theForm.__EVENTARGUMENT.value = eventArgument;
        theForm.submit();
    }
}
//]]>





	
	

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
            
                
                    
                        
                            
                                
                                    Documentos
                                    -
                                    Generación de DTE  
                            
                            
                        
                        
                            Ciclo:
                            
                                288
                            
                            Lote:

                            
                                1
                            
                        
                        
                            Alcance:
                            
                                Ciclo  288 -  Lote  1
                            
                            A Procesar:
                            Etapa:
                            
                                0 de 0
                            
                        
                        
                            Inicio:
                            
                                
                            
                            Fin:
                            
                                
                            
                        
                        
                            Procesados:
                            
                                0
                            
                            Tiempo:
                            
                                00:00:00
                            
                        
                        
                            Usuario:
                            
                                GONZALEZ GUTIERREZ LUIS MARCELO
                            
                            Errores:
                            
                                0
                            
                        
                        
                            Estado:
                            
                                Inicial
                            
                             
                             
                        
                        
                            
                                
                                    0%
                                
                            
                        
                    
                    
                        
                            
                            
                                
	
		
			
		Guardar DTE
	

&lt;!--
aspxAddHoverItems(&quot; , &quot;'&quot; , &quot;xbtnGuardarDTE&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonHover_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddPressedItems(&quot; , &quot;'&quot; , &quot;xbtnGuardarDTE&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonPressed_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddDisabledItems(&quot; , &quot;'&quot; , &quot;xbtnGuardarDTE&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbDisabled_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);

var dxo = new ASPxClientButton(&quot; , &quot;'&quot; , &quot;xbtnGuardarDTE&quot; , &quot;'&quot; , &quot;);
window[&quot; , &quot;'&quot; , &quot;xbtnGuardarDTE&quot; , &quot;'&quot; , &quot;] = dxo;
dxo.autoPostBack = true;
dxo.clientEnabled = false;
dxo.Click.AddHandler(exportar);
dxo.allowFocus = false;
dxo.AfterCreate();

//-->

                            
                            
                                
	
		
			
		Guardar Inserto
	

&lt;!--
aspxAddHoverItems(&quot; , &quot;'&quot; , &quot;xbtnGuardarInserto&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonHover_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddPressedItems(&quot; , &quot;'&quot; , &quot;xbtnGuardarInserto&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonPressed_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddDisabledItems(&quot; , &quot;'&quot; , &quot;xbtnGuardarInserto&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbDisabled_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);

var dxo = new ASPxClientButton(&quot; , &quot;'&quot; , &quot;xbtnGuardarInserto&quot; , &quot;'&quot; , &quot;);
window[&quot; , &quot;'&quot; , &quot;xbtnGuardarInserto&quot; , &quot;'&quot; , &quot;] = dxo;
dxo.autoPostBack = true;
dxo.clientEnabled = false;
dxo.Click.AddHandler(exportar);
dxo.allowFocus = false;
dxo.AfterCreate();

//-->

                            
                        
                    
                
                
                    
                        
	
		
			
		Aceptar
	

&lt;!--
aspxAddHoverItems(&quot; , &quot;'&quot; , &quot;xbtnAceptar&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonHover_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddPressedItems(&quot; , &quot;'&quot; , &quot;xbtnAceptar&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonPressed_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddDisabledItems(&quot; , &quot;'&quot; , &quot;xbtnAceptar&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbDisabled_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);

var dxo = new ASPxClientButton(&quot; , &quot;'&quot; , &quot;xbtnAceptar&quot; , &quot;'&quot; , &quot;);
window[&quot; , &quot;'&quot; , &quot;xbtnAceptar&quot; , &quot;'&quot; , &quot;] = dxo;
dxo.autoPostBack = true;
dxo.clientVisible = false;
dxo.Click.AddHandler(Aceptar);
dxo.allowFocus = false;
dxo.AfterCreate();

//-->

                        
	
		
			
		Ejecutar
	

&lt;!--
aspxAddHoverItems(&quot; , &quot;'&quot; , &quot;xbtnEjecutar&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonHover_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddPressedItems(&quot; , &quot;'&quot; , &quot;xbtnEjecutar&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonPressed_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddDisabledItems(&quot; , &quot;'&quot; , &quot;xbtnEjecutar&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbDisabled_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);

var dxo = new ASPxClientButton(&quot; , &quot;'&quot; , &quot;xbtnEjecutar&quot; , &quot;'&quot; , &quot;);
window[&quot; , &quot;'&quot; , &quot;xbtnEjecutar&quot; , &quot;'&quot; , &quot;] = dxo;
dxo.autoPostBack = true;
dxo.Click.AddHandler(ejecutar);
dxo.allowFocus = false;
dxo.AfterCreate();

//-->

                    
                    
                        
	
		
			
		Cancelar
	

&lt;!--
aspxAddHoverItems(&quot; , &quot;'&quot; , &quot;xbtnCancelar&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonHover_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddPressedItems(&quot; , &quot;'&quot; , &quot;xbtnCancelar&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonPressed_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddDisabledItems(&quot; , &quot;'&quot; , &quot;xbtnCancelar&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbDisabled_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);

var dxo = new ASPxClientButton(&quot; , &quot;'&quot; , &quot;xbtnCancelar&quot; , &quot;'&quot; , &quot;);
window[&quot; , &quot;'&quot; , &quot;xbtnCancelar&quot; , &quot;'&quot; , &quot;] = dxo;
dxo.autoPostBack = true;
dxo.Click.AddHandler(cancelar);
dxo.allowFocus = false;
dxo.AfterCreate();

//-->

                    

                    
                    
                        
	
		
			
		Errores
	

&lt;!--
aspxAddHoverItems(&quot; , &quot;'&quot; , &quot;xbtnErrores&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonHover_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddPressedItems(&quot; , &quot;'&quot; , &quot;xbtnErrores&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbButtonPressed_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);
aspxAddDisabledItems(&quot; , &quot;'&quot; , &quot;xbtnErrores&quot; , &quot;'&quot; , &quot;,[[[&quot; , &quot;'&quot; , &quot;dxbDisabled_Office2010Blue&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;],[&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;TC&quot; , &quot;'&quot; , &quot;]]]);

var dxo = new ASPxClientButton(&quot; , &quot;'&quot; , &quot;xbtnErrores&quot; , &quot;'&quot; , &quot;);
window[&quot; , &quot;'&quot; , &quot;xbtnErrores&quot; , &quot;'&quot; , &quot;] = dxo;
dxo.autoPostBack = true;
dxo.clientEnabled = false;
dxo.Click.AddHandler(verErrores);
dxo.allowFocus = false;
dxo.AfterCreate();

//-->

                    
                
            
        
    &quot;))]</value>
      <webElementGuid>dc91c038-1cbf-4f7f-a117-2151cf228265</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
