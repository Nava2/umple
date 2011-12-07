package cruise.umple.compiler.php;

import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;

@SuppressWarnings("unused")
public class PhpClassGenerator implements ILang
{

  protected static String nl;
  public static synchronized PhpClassGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    PhpClassGenerator result = new PhpClassGenerator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?php";
  protected final String TEXT_2 = NL + "/*PLEASE DO NOT EDIT THIS CODE*/" + NL + "/*This code was generated using the UMPLE @UMPLE_VERSION@ modeling language!*/" + NL;
  protected final String TEXT_3 = NL + "class ";
  protected final String TEXT_4 = NL + "{";
  protected final String TEXT_5 = NL + NL + "  //------------------------" + NL + "  // CONSTRUCTOR" + NL + "  //------------------------" + NL;
  protected final String TEXT_6 = NL + "    $";
  protected final String TEXT_7 = "->";
  protected final String TEXT_8 = " = array();";
  protected final String TEXT_9 = NL + "    $this->";
  protected final String TEXT_10 = "();";
  protected final String TEXT_11 = NL + "    $this->";
  protected final String TEXT_12 = " = true;";
  protected final String TEXT_13 = NL + "    $this->";
  protected final String TEXT_14 = " = ";
  protected final String TEXT_15 = ";" + NL + "    $this->";
  protected final String TEXT_16 = " = false;";
  protected final String TEXT_17 = NL + "    $";
  protected final String TEXT_18 = "->";
  protected final String TEXT_19 = " = ";
  protected final String TEXT_20 = ";";
  protected final String TEXT_21 = NL + "    $";
  protected final String TEXT_22 = "->";
  protected final String TEXT_23 = " = ";
  protected final String TEXT_24 = ";";
  protected final String TEXT_25 = NL + "    $";
  protected final String TEXT_26 = "->";
  protected final String TEXT_27 = " = self::$";
  protected final String TEXT_28 = "++;";
  protected final String TEXT_29 = NL + "    if (!$";
  protected final String TEXT_30 = "->";
  protected final String TEXT_31 = "($";
  protected final String TEXT_32 = "))" + NL + "    {" + NL + "      throw new Exception(\"Unable to create ";
  protected final String TEXT_33 = " due to ";
  protected final String TEXT_34 = "\");" + NL + "    }";
  protected final String TEXT_35 = NL + "    $";
  protected final String TEXT_36 = "->";
  protected final String TEXT_37 = " = array();" + NL + "    $";
  protected final String TEXT_38 = " = $";
  protected final String TEXT_39 = "->";
  protected final String TEXT_40 = "($";
  protected final String TEXT_41 = ");" + NL + "    if (!$";
  protected final String TEXT_42 = ")" + NL + "    {" + NL + "      throw new Exception(\"Unable to create ";
  protected final String TEXT_43 = ", must have ";
  protected final String TEXT_44 = " ";
  protected final String TEXT_45 = "\");" + NL + "    }";
  protected final String TEXT_46 = NL + "    $";
  protected final String TEXT_47 = "->";
  protected final String TEXT_48 = " = array();";
  protected final String TEXT_49 = NL + "    if ($";
  protected final String TEXT_50 = " == null || $";
  protected final String TEXT_51 = "->";
  protected final String TEXT_52 = "() != null)" + NL + "    {" + NL + "      throw new Exception(\"Unable to create ";
  protected final String TEXT_53 = " due to ";
  protected final String TEXT_54 = "\");" + NL + "    }" + NL + "    $";
  protected final String TEXT_55 = "->";
  protected final String TEXT_56 = " = $";
  protected final String TEXT_57 = ";";
  protected final String TEXT_58 = NL + "    $";
  protected final String TEXT_59 = "->";
  protected final String TEXT_60 = " = array();";
  protected final String TEXT_61 = NL + "    $";
  protected final String TEXT_62 = " = $";
  protected final String TEXT_63 = "->";
  protected final String TEXT_64 = "($";
  protected final String TEXT_65 = ");" + NL + "    if (!$";
  protected final String TEXT_66 = ")" + NL + "    {" + NL + "      throw new Exception(\"Unable to create ";
  protected final String TEXT_67 = " due to ";
  protected final String TEXT_68 = "\");" + NL + "    }";
  protected final String TEXT_69 = NL + "    $";
  protected final String TEXT_70 = "->";
  protected final String TEXT_71 = " = array();" + NL + "    $";
  protected final String TEXT_72 = " = $";
  protected final String TEXT_73 = "->";
  protected final String TEXT_74 = "($";
  protected final String TEXT_75 = ");" + NL + "    if (!$";
  protected final String TEXT_76 = ")" + NL + "    {" + NL + "      throw new Exception(\"Unable to create ";
  protected final String TEXT_77 = ", must have ";
  protected final String TEXT_78 = " ";
  protected final String TEXT_79 = "\");" + NL + "    }";
  protected final String TEXT_80 = "$this->";
  protected final String TEXT_81 = " = array();" + NL + "    $this->";
  protected final String TEXT_82 = "[] = $";
  protected final String TEXT_83 = ";";
  protected final String TEXT_84 = NL + "    $this->";
  protected final String TEXT_85 = "(self::$";
  protected final String TEXT_86 = ");";
  protected final String TEXT_87 = NL + "    $this->";
  protected final String TEXT_88 = "(self::$";
  protected final String TEXT_89 = ");";
  protected final String TEXT_90 = NL + "  public static function getInstance()" + NL + "  {" + NL + "    if(self::$theInstance == null)" + NL + "    {" + NL + "      self::$theInstance = new ";
  protected final String TEXT_91 = "();" + NL + "    }" + NL + "    return self::$theInstance;" + NL + "  }";
  protected final String TEXT_92 = NL + "  public static function newInstance(";
  protected final String TEXT_93 = ")" + NL + "  {" + NL + "    $";
  protected final String TEXT_94 = " = new ";
  protected final String TEXT_95 = "();";
  protected final String TEXT_96 = NL + "    $";
  protected final String TEXT_97 = "->";
  protected final String TEXT_98 = " = array();";
  protected final String TEXT_99 = NL + "    $this->";
  protected final String TEXT_100 = "();";
  protected final String TEXT_101 = NL + "    $";
  protected final String TEXT_102 = "->";
  protected final String TEXT_103 = " = ";
  protected final String TEXT_104 = ";";
  protected final String TEXT_105 = NL + "    $";
  protected final String TEXT_106 = "->";
  protected final String TEXT_107 = " = self::$";
  protected final String TEXT_108 = "++;";
  protected final String TEXT_109 = NL + "    $";
  protected final String TEXT_110 = "->";
  protected final String TEXT_111 = " = new ";
  protected final String TEXT_112 = "(";
  protected final String TEXT_113 = ");";
  protected final String TEXT_114 = NL + "    $";
  protected final String TEXT_115 = "->";
  protected final String TEXT_116 = " = array();" + NL + "    $";
  protected final String TEXT_117 = " = $";
  protected final String TEXT_118 = "->";
  protected final String TEXT_119 = "($";
  protected final String TEXT_120 = ");" + NL + "    if (!$";
  protected final String TEXT_121 = ")" + NL + "    {" + NL + "      throw new Exception(\"Unable to create ";
  protected final String TEXT_122 = ", must have ";
  protected final String TEXT_123 = " ";
  protected final String TEXT_124 = "\");" + NL + "    }";
  protected final String TEXT_125 = "$this->";
  protected final String TEXT_126 = " = array();" + NL + "    $this->";
  protected final String TEXT_127 = "[] = $";
  protected final String TEXT_128 = ";";
  protected final String TEXT_129 = NL + "  private function callParentConstructor(";
  protected final String TEXT_130 = ")" + NL + "  {" + NL + "    parent::__construct(";
  protected final String TEXT_131 = ");" + NL + "  }" + NL;
  protected final String TEXT_132 = NL + NL + "  //------------------------" + NL + "  // INTERFACE" + NL + "  //------------------------" + NL;
  protected final String TEXT_133 = NL + "  public function ";
  protected final String TEXT_134 = "($";
  protected final String TEXT_135 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_136 = NL + "    $this->";
  protected final String TEXT_137 = " = false;" + NL + "    $this->";
  protected final String TEXT_138 = " = $";
  protected final String TEXT_139 = ";" + NL + "    $wasSet = true;";
  protected final String TEXT_140 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_141 = NL + "  public function ";
  protected final String TEXT_142 = "($";
  protected final String TEXT_143 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_144 = NL + "    $this->";
  protected final String TEXT_145 = " = $";
  protected final String TEXT_146 = ";" + NL + "    $wasSet = true;";
  protected final String TEXT_147 = NL + "    return $wasSet;" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_148 = "()" + NL + "  {" + NL + "    $wasReset = false;";
  protected final String TEXT_149 = NL + "    $this->";
  protected final String TEXT_150 = " = $this->";
  protected final String TEXT_151 = "();" + NL + "    $wasReset = true;";
  protected final String TEXT_152 = NL + "    return $wasReset;" + NL + "  }" + NL;
  protected final String TEXT_153 = NL + "  public function ";
  protected final String TEXT_154 = "($";
  protected final String TEXT_155 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  protected final String TEXT_156 = NL + "    $this->";
  protected final String TEXT_157 = "[] = $";
  protected final String TEXT_158 = ";" + NL + "    $wasAdded = true;";
  protected final String TEXT_159 = NL + "    return $wasAdded;" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_160 = "($";
  protected final String TEXT_161 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  protected final String TEXT_162 = NL + "    unset($this->";
  protected final String TEXT_163 = "[$this->";
  protected final String TEXT_164 = "($";
  protected final String TEXT_165 = ")]);" + NL + "    $this->";
  protected final String TEXT_166 = " = array_values($this->";
  protected final String TEXT_167 = ");" + NL + "    $wasRemoved = true;";
  protected final String TEXT_168 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  protected final String TEXT_169 = NL + "  public function ";
  protected final String TEXT_170 = "($";
  protected final String TEXT_171 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_172 = NL + "    $this->";
  protected final String TEXT_173 = " = $";
  protected final String TEXT_174 = ";" + NL + "    $wasSet = true;";
  protected final String TEXT_175 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_176 = NL + "  public function ";
  protected final String TEXT_177 = "($index)" + NL + "  {";
  protected final String TEXT_178 = NL + "    $";
  protected final String TEXT_179 = " = $this->";
  protected final String TEXT_180 = "[$index];";
  protected final String TEXT_181 = NL + "    return $";
  protected final String TEXT_182 = ";" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_183 = "()" + NL + "  {";
  protected final String TEXT_184 = NL + "    $";
  protected final String TEXT_185 = " = $this->";
  protected final String TEXT_186 = ";";
  protected final String TEXT_187 = NL + "    return $";
  protected final String TEXT_188 = ";" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_189 = "()" + NL + "  {";
  protected final String TEXT_190 = NL + "    $number = count($this->";
  protected final String TEXT_191 = ");";
  protected final String TEXT_192 = NL + "    return $number;" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_193 = "()" + NL + "  {";
  protected final String TEXT_194 = NL + "    $has = ";
  protected final String TEXT_195 = ".size() > 0;";
  protected final String TEXT_196 = NL + "    return $has;" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_197 = "($";
  protected final String TEXT_198 = ")" + NL + "  {";
  protected final String TEXT_199 = NL + "    $rawAnswer = array_search($";
  protected final String TEXT_200 = ",$this->";
  protected final String TEXT_201 = ");" + NL + "    $index = $rawAnswer == null && $rawAnswer !== 0 ? -1 : $rawAnswer;";
  protected final String TEXT_202 = NL + "    return $index;" + NL + "  }" + NL;
  protected final String TEXT_203 = NL + "  public function ";
  protected final String TEXT_204 = "()" + NL + "  {";
  protected final String TEXT_205 = NL + "    $";
  protected final String TEXT_206 = " = ";
  protected final String TEXT_207 = ";";
  protected final String TEXT_208 = NL + "    return $";
  protected final String TEXT_209 = ";" + NL + "  }";
  protected final String TEXT_210 = NL + "  public function ";
  protected final String TEXT_211 = "()" + NL + "  {";
  protected final String TEXT_212 = NL + "    return ";
  protected final String TEXT_213 = ";" + NL + "  }";
  protected final String TEXT_214 = NL + "  public function ";
  protected final String TEXT_215 = "()" + NL + "  {";
  protected final String TEXT_216 = NL + "    $";
  protected final String TEXT_217 = " = $this->";
  protected final String TEXT_218 = ";";
  protected final String TEXT_219 = NL + "    return $";
  protected final String TEXT_220 = ";" + NL + "  }";
  protected final String TEXT_221 = NL + "  public function ";
  protected final String TEXT_222 = "()" + NL + "  {";
  protected final String TEXT_223 = NL + "    return $this->";
  protected final String TEXT_224 = ";" + NL + "  }";
  protected final String TEXT_225 = NL + "  public function ";
  protected final String TEXT_226 = "()" + NL + "  {";
  protected final String TEXT_227 = NL + "    $";
  protected final String TEXT_228 = " = ";
  protected final String TEXT_229 = ";";
  protected final String TEXT_230 = NL + "    return $";
  protected final String TEXT_231 = ";" + NL + "  }" + NL;
  protected final String TEXT_232 = NL + "  public function ";
  protected final String TEXT_233 = "()" + NL + "  {";
  protected final String TEXT_234 = NL + "    return ";
  protected final String TEXT_235 = ";" + NL + "  }" + NL;
  protected final String TEXT_236 = NL + "  public function ";
  protected final String TEXT_237 = "()" + NL + "  {";
  protected final String TEXT_238 = NL + "    $";
  protected final String TEXT_239 = " = $this->";
  protected final String TEXT_240 = ";";
  protected final String TEXT_241 = NL + "    return $";
  protected final String TEXT_242 = ";" + NL + "  }";
  protected final String TEXT_243 = NL + "  public function ";
  protected final String TEXT_244 = "()" + NL + "  {";
  protected final String TEXT_245 = NL + "    return $this->";
  protected final String TEXT_246 = ";" + NL + "  }";
  protected final String TEXT_247 = NL + "  public ";
  protected final String TEXT_248 = " ";
  protected final String TEXT_249 = "()" + NL + "  {";
  protected final String TEXT_250 = NL + "    ";
  protected final String TEXT_251 = " ";
  protected final String TEXT_252 = " = ";
  protected final String TEXT_253 = ";";
  protected final String TEXT_254 = NL + "    return ";
  protected final String TEXT_255 = ";" + NL + "  }";
  protected final String TEXT_256 = NL + "  public ";
  protected final String TEXT_257 = " ";
  protected final String TEXT_258 = "()" + NL + "  {";
  protected final String TEXT_259 = NL + "    return ";
  protected final String TEXT_260 = ";" + NL + "  }";
  protected final String TEXT_261 = NL + "  public ";
  protected final String TEXT_262 = " ";
  protected final String TEXT_263 = "()" + NL + "  {";
  protected final String TEXT_264 = NL + "    $";
  protected final String TEXT_265 = " = $this->";
  protected final String TEXT_266 = ";";
  protected final String TEXT_267 = NL + "    return $";
  protected final String TEXT_268 = ";" + NL + "  }";
  protected final String TEXT_269 = NL + "  public function ";
  protected final String TEXT_270 = "()" + NL + "  {";
  protected final String TEXT_271 = NL + "    return $this->";
  protected final String TEXT_272 = ";" + NL + "  }";
  protected final String TEXT_273 = NL + "  public function ";
  protected final String TEXT_274 = "()" + NL + "  {" + NL + "    $answer = $this->";
  protected final String TEXT_275 = "();";
  protected final String TEXT_276 = NL + "    return $answer;" + NL + "  }" + NL;
  protected final String TEXT_277 = NL + "  public function ";
  protected final String TEXT_278 = "()" + NL + "  {";
  protected final String TEXT_279 = NL + "    return null;" + NL + "  }" + NL;
  protected final String TEXT_280 = NL + "  public function ";
  protected final String TEXT_281 = "()" + NL + "  {" + NL + "    $wasEventProcessed = false;";
  protected final String TEXT_282 = NL + "    ";
  protected final String TEXT_283 = NL + "    return $wasEventProcessed;" + NL + "  }" + NL;
  protected final String TEXT_284 = NL + "  public function ";
  protected final String TEXT_285 = "($";
  protected final String TEXT_286 = ")" + NL + "  {";
  protected final String TEXT_287 = NL + "    ";
  protected final String TEXT_288 = NL + "    else" + NL + "    {" + NL + "      return false;" + NL + "    }" + NL + "  }" + NL;
  protected final String TEXT_289 = NL + "  private function ";
  protected final String TEXT_290 = "()" + NL + "  {";
  protected final String TEXT_291 = NL + "    ";
  protected final String TEXT_292 = NL + "  }" + NL;
  protected final String TEXT_293 = NL + "  private function ";
  protected final String TEXT_294 = "($";
  protected final String TEXT_295 = ")" + NL + "  {";
  protected final String TEXT_296 = NL + "    $this->";
  protected final String TEXT_297 = " = $";
  protected final String TEXT_298 = ";";
  protected final String TEXT_299 = NL + "    if ($this->";
  protected final String TEXT_300 = " != self::$";
  protected final String TEXT_301 = " && $";
  protected final String TEXT_302 = " != self::$";
  protected final String TEXT_303 = ") { $this->";
  protected final String TEXT_304 = "(self::$";
  protected final String TEXT_305 = "); }";
  protected final String TEXT_306 = NL + NL + "    // entry actions and do activities";
  protected final String TEXT_307 = NL + "    ";
  protected final String TEXT_308 = NL + "  }" + NL;
  protected final String TEXT_309 = NL + "  public function ";
  protected final String TEXT_310 = "()" + NL + "  {";
  protected final String TEXT_311 = NL + "    return $this->";
  protected final String TEXT_312 = ";";
  protected final String TEXT_313 = NL + "    $";
  protected final String TEXT_314 = " = $this->";
  protected final String TEXT_315 = ";";
  protected final String TEXT_316 = NL + "    return $";
  protected final String TEXT_317 = ";";
  protected final String TEXT_318 = NL + "  }" + NL;
  protected final String TEXT_319 = NL + "  public function ";
  protected final String TEXT_320 = "($index)" + NL + "  {";
  protected final String TEXT_321 = NL + "    $";
  protected final String TEXT_322 = " = $this->";
  protected final String TEXT_323 = "[$index];";
  protected final String TEXT_324 = NL + "    return $";
  protected final String TEXT_325 = ";" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_326 = "()" + NL + "  {";
  protected final String TEXT_327 = NL + "    $";
  protected final String TEXT_328 = " = $this->";
  protected final String TEXT_329 = ";";
  protected final String TEXT_330 = NL + "    return $";
  protected final String TEXT_331 = ";" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_332 = "()" + NL + "  {";
  protected final String TEXT_333 = NL + "    $number = count($this->";
  protected final String TEXT_334 = ");";
  protected final String TEXT_335 = NL + "    return $number;" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_336 = "()" + NL + "  {";
  protected final String TEXT_337 = NL + "    $has = $this->";
  protected final String TEXT_338 = "() > 0;";
  protected final String TEXT_339 = NL + "    return $has;" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_340 = "($";
  protected final String TEXT_341 = ")" + NL + "  {";
  protected final String TEXT_342 = NL + "    $wasFound = false;" + NL + "    $index = 0;" + NL + "    foreach($this->";
  protected final String TEXT_343 = " as $";
  protected final String TEXT_344 = ")" + NL + "    {" + NL + "      if ($";
  protected final String TEXT_345 = "->equals($";
  protected final String TEXT_346 = "))" + NL + "      {" + NL + "        $wasFound = true;" + NL + "        break;" + NL + "      }" + NL + "      $index += 1;" + NL + "    }" + NL + "    $index = $wasFound ? $index : -1;";
  protected final String TEXT_347 = NL + "    return $index;" + NL + "  }" + NL;
  protected final String TEXT_348 = "UNABLE TO UNDERSAND association variable (see association_Get_All.jet)";
  protected final String TEXT_349 = "//FIXME - FOUND UNKNOWN ASSOCIATION RELATIONSHIP ";
  protected final String TEXT_350 = " : ";
  protected final String TEXT_351 = NL + "  public function ";
  protected final String TEXT_352 = "()" + NL + "  {";
  protected final String TEXT_353 = NL + "    $isValid = $this->";
  protected final String TEXT_354 = "() >= self::";
  protected final String TEXT_355 = "();";
  protected final String TEXT_356 = NL + "    $isValid = $this->";
  protected final String TEXT_357 = "() >= self::";
  protected final String TEXT_358 = "() && $this->";
  protected final String TEXT_359 = "() <= self::";
  protected final String TEXT_360 = "();";
  protected final String TEXT_361 = NL + "    return $isValid;" + NL + "  }";
  protected final String TEXT_362 = NL + "  public static function ";
  protected final String TEXT_363 = "()" + NL + "  {" + NL + "    return ";
  protected final String TEXT_364 = ";" + NL + "  }";
  protected final String TEXT_365 = NL + "  public static function ";
  protected final String TEXT_366 = "()" + NL + "  {";
  protected final String TEXT_367 = NL + "    $minimum = ";
  protected final String TEXT_368 = ";";
  protected final String TEXT_369 = NL + "    return $minimum;" + NL + "  }";
  protected final String TEXT_370 = NL + "  public static function ";
  protected final String TEXT_371 = "()" + NL + "  {" + NL + "    return ";
  protected final String TEXT_372 = ";" + NL + "  }";
  protected final String TEXT_373 = NL + "  public static function ";
  protected final String TEXT_374 = "()" + NL + "  {";
  protected final String TEXT_375 = NL + "    $minimum = ";
  protected final String TEXT_376 = ";";
  protected final String TEXT_377 = NL + "    return $minimum;" + NL + "  }";
  protected final String TEXT_378 = NL + "  public static function ";
  protected final String TEXT_379 = "()" + NL + "  {" + NL + "    return ";
  protected final String TEXT_380 = ";" + NL + "  }";
  protected final String TEXT_381 = NL + "  public static function ";
  protected final String TEXT_382 = "()" + NL + "  {";
  protected final String TEXT_383 = NL + "    $maximum = ";
  protected final String TEXT_384 = ";";
  protected final String TEXT_385 = NL + "    return $maximum;" + NL + "  }";
  protected final String TEXT_386 = NL + "  public function ";
  protected final String TEXT_387 = "($";
  protected final String TEXT_388 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  protected final String TEXT_389 = NL + "    if ($this->";
  protected final String TEXT_390 = "() >= self::";
  protected final String TEXT_391 = "())" + NL + "    {";
  protected final String TEXT_392 = NL + "      return $wasAdded;" + NL + "    }" + NL;
  protected final String TEXT_393 = NL + "    $this->";
  protected final String TEXT_394 = "[] = $";
  protected final String TEXT_395 = ";" + NL + "    if ($";
  protected final String TEXT_396 = "->";
  protected final String TEXT_397 = "($this) != -1)" + NL + "    {" + NL + "      $wasAdded = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $wasAdded = $";
  protected final String TEXT_398 = "->";
  protected final String TEXT_399 = "($this);" + NL + "      if (!$wasAdded)" + NL + "      {" + NL + "        array_pop($this->";
  protected final String TEXT_400 = ");" + NL + "      }" + NL + "    }";
  protected final String TEXT_401 = NL + "    return $wasAdded;" + NL + "  }";
  protected final String TEXT_402 = NL + "  public function ";
  protected final String TEXT_403 = "($";
  protected final String TEXT_404 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  protected final String TEXT_405 = NL + "    if ($this->";
  protected final String TEXT_406 = "($";
  protected final String TEXT_407 = ") == -1)" + NL + "    {";
  protected final String TEXT_408 = NL + "      return $wasRemoved;" + NL + "    }" + NL + "" + NL + "    $oldIndex = $this->";
  protected final String TEXT_409 = "($";
  protected final String TEXT_410 = ");" + NL + "    unset($this->";
  protected final String TEXT_411 = "[$oldIndex]);" + NL + "    if ($";
  protected final String TEXT_412 = "->";
  protected final String TEXT_413 = "($this) == -1)" + NL + "    {" + NL + "      $wasRemoved = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $wasRemoved = $";
  protected final String TEXT_414 = "->";
  protected final String TEXT_415 = "($this);" + NL + "      if (!$wasRemoved)" + NL + "      {" + NL + "        $this->";
  protected final String TEXT_416 = "[$oldIndex] = $";
  protected final String TEXT_417 = ";" + NL + "        ksort($this->";
  protected final String TEXT_418 = ");" + NL + "      }" + NL + "    }" + NL + "    $this->";
  protected final String TEXT_419 = " = array_values($this->";
  protected final String TEXT_420 = ");";
  protected final String TEXT_421 = NL + "    return $wasRemoved;" + NL + "  }";
  protected final String TEXT_422 = NL + "  public function ";
  protected final String TEXT_423 = "($";
  protected final String TEXT_424 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_425 = NL + "    $this->";
  protected final String TEXT_426 = " = $";
  protected final String TEXT_427 = ";" + NL + "    $wasSet = true;";
  protected final String TEXT_428 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_429 = NL + "  public function ";
  protected final String TEXT_430 = "($";
  protected final String TEXT_431 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_432 = NL + "    if ($";
  protected final String TEXT_433 = " != null)" + NL + "    {" + NL + "      $this->";
  protected final String TEXT_434 = " = $";
  protected final String TEXT_435 = ";" + NL + "      $wasSet = true;" + NL + "    }";
  protected final String TEXT_436 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_437 = NL + "  public function ";
  protected final String TEXT_438 = "($";
  protected final String TEXT_439 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_440 = NL + "    if ($this->";
  protected final String TEXT_441 = " != null && $this->";
  protected final String TEXT_442 = " != $";
  protected final String TEXT_443 = " && $this == $this->";
  protected final String TEXT_444 = "->";
  protected final String TEXT_445 = "())" + NL + "    {" + NL + "      //Unable to ";
  protected final String TEXT_446 = ", as existing ";
  protected final String TEXT_447 = " would become an orphan";
  protected final String TEXT_448 = NL + "      return $wasSet;" + NL + "    }" + NL + "    " + NL + "    $this->";
  protected final String TEXT_449 = " = $";
  protected final String TEXT_450 = ";" + NL + "    $";
  protected final String TEXT_451 = " = $";
  protected final String TEXT_452 = " != null ? $";
  protected final String TEXT_453 = "->";
  protected final String TEXT_454 = "() : null;" + NL + "    " + NL + "    if ($this != $";
  protected final String TEXT_455 = ")" + NL + "    {" + NL + "      if ($";
  protected final String TEXT_456 = " != null)" + NL + "      {" + NL + "        $";
  protected final String TEXT_457 = "->";
  protected final String TEXT_458 = " = null;" + NL + "      }" + NL + "      if ($this->";
  protected final String TEXT_459 = " != null)" + NL + "      {" + NL + "        $this->";
  protected final String TEXT_460 = "->";
  protected final String TEXT_461 = "($this);" + NL + "      }" + NL + "    }" + NL + "    $wasSet = true;";
  protected final String TEXT_462 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_463 = NL + "  public function ";
  protected final String TEXT_464 = "($";
  protected final String TEXT_465 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_466 = NL + "    if ($";
  protected final String TEXT_467 = " == null)" + NL + "    {" + NL + "      //Unable to ";
  protected final String TEXT_468 = " to null, as ";
  protected final String TEXT_469 = " must always be associated to a ";
  protected final String TEXT_470 = NL + "      return $wasSet;" + NL + "    }" + NL + "    " + NL + "    $";
  protected final String TEXT_471 = " = $";
  protected final String TEXT_472 = "->";
  protected final String TEXT_473 = "();" + NL + "    if ($";
  protected final String TEXT_474 = " != null && $this != $";
  protected final String TEXT_475 = ")" + NL + "    {" + NL + "      //Unable to ";
  protected final String TEXT_476 = ", the current ";
  protected final String TEXT_477 = " already has a ";
  protected final String TEXT_478 = ", which would be orphaned if it were re-assigned";
  protected final String TEXT_479 = NL + "      return $wasSet;" + NL + "    }" + NL + "    " + NL + "    $";
  protected final String TEXT_480 = " = $this->";
  protected final String TEXT_481 = ";" + NL + "    $this->";
  protected final String TEXT_482 = " = $";
  protected final String TEXT_483 = ";" + NL + "    $this->";
  protected final String TEXT_484 = "->";
  protected final String TEXT_485 = "($this);" + NL + "    " + NL + "    if ($";
  protected final String TEXT_486 = " != null)" + NL + "    {" + NL + "      $";
  protected final String TEXT_487 = "->";
  protected final String TEXT_488 = "(null);" + NL + "    }" + NL + "    $wasSet = true;";
  protected final String TEXT_489 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_490 = NL + "  public function ";
  protected final String TEXT_491 = "(";
  protected final String TEXT_492 = ")" + NL + "  {" + NL + "    return new ";
  protected final String TEXT_493 = "(";
  protected final String TEXT_494 = ");" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_495 = "($";
  protected final String TEXT_496 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  protected final String TEXT_497 = NL + "    $";
  protected final String TEXT_498 = " = $";
  protected final String TEXT_499 = "->";
  protected final String TEXT_500 = "();" + NL + "    $";
  protected final String TEXT_501 = " = $";
  protected final String TEXT_502 = " != null && $this !== $";
  protected final String TEXT_503 = ";" + NL + "" + NL + "    if ($";
  protected final String TEXT_504 = " && $";
  protected final String TEXT_505 = "->";
  protected final String TEXT_506 = "() <= self::";
  protected final String TEXT_507 = "())" + NL + "    {" + NL + "      return $wasAdded;" + NL + "    }" + NL + "" + NL + "    if ($";
  protected final String TEXT_508 = ")" + NL + "    {" + NL + "      $";
  protected final String TEXT_509 = "->";
  protected final String TEXT_510 = "($this);" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $this->";
  protected final String TEXT_511 = "[] = $";
  protected final String TEXT_512 = ";" + NL + "    }" + NL + "    $wasAdded = true;";
  protected final String TEXT_513 = NL + "    return $wasAdded;" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_514 = "($";
  protected final String TEXT_515 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  protected final String TEXT_516 = NL + "    //Unable to remove ";
  protected final String TEXT_517 = ", as it must always have a ";
  protected final String TEXT_518 = NL + "    if ($this === $";
  protected final String TEXT_519 = "->";
  protected final String TEXT_520 = "())" + NL + "    {";
  protected final String TEXT_521 = NL + "      return $wasRemoved;" + NL + "    }" + NL + "" + NL + "    //";
  protected final String TEXT_522 = " already at minimum (";
  protected final String TEXT_523 = ")" + NL + "    if ($this->";
  protected final String TEXT_524 = "() <= self::";
  protected final String TEXT_525 = "())" + NL + "    {";
  protected final String TEXT_526 = NL + "      return $wasRemoved;" + NL + "    }" + NL + "" + NL + "    unset($this->";
  protected final String TEXT_527 = "[$this->";
  protected final String TEXT_528 = "($";
  protected final String TEXT_529 = ")]);" + NL + "    $this->";
  protected final String TEXT_530 = " = array_values($this->";
  protected final String TEXT_531 = ");" + NL + "    $wasRemoved = true;";
  protected final String TEXT_532 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  protected final String TEXT_533 = NL + "  public function ";
  protected final String TEXT_534 = "(";
  protected final String TEXT_535 = ")" + NL + "  {" + NL + "    if ($this->";
  protected final String TEXT_536 = "() >= self::";
  protected final String TEXT_537 = "())" + NL + "    {" + NL + "      return null;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      return new ";
  protected final String TEXT_538 = "(";
  protected final String TEXT_539 = ");" + NL + "    }" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_540 = "($";
  protected final String TEXT_541 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  protected final String TEXT_542 = NL + "    if ($this->";
  protected final String TEXT_543 = "() >= self::";
  protected final String TEXT_544 = "())" + NL + "    {";
  protected final String TEXT_545 = NL + "      return $wasAdded;" + NL + "    }" + NL + "" + NL + "    $";
  protected final String TEXT_546 = " = $";
  protected final String TEXT_547 = "->";
  protected final String TEXT_548 = "();" + NL + "    $";
  protected final String TEXT_549 = " = $";
  protected final String TEXT_550 = " != null && $this !== $";
  protected final String TEXT_551 = ";" + NL + "" + NL + "    if ($";
  protected final String TEXT_552 = " && $";
  protected final String TEXT_553 = "->";
  protected final String TEXT_554 = "() <= self::";
  protected final String TEXT_555 = "())" + NL + "    {";
  protected final String TEXT_556 = NL + "      return $wasAdded;" + NL + "    }" + NL + "" + NL + "    if ($";
  protected final String TEXT_557 = ")" + NL + "    {" + NL + "      $";
  protected final String TEXT_558 = "->";
  protected final String TEXT_559 = "($this);" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $this->";
  protected final String TEXT_560 = "[] = $";
  protected final String TEXT_561 = ";" + NL + "    }" + NL + "    $wasAdded = true;";
  protected final String TEXT_562 = NL + "    return $wasAdded;" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_563 = "($";
  protected final String TEXT_564 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  protected final String TEXT_565 = NL + "    //Unable to remove ";
  protected final String TEXT_566 = ", as it must always have a ";
  protected final String TEXT_567 = NL + "    if ($this === $";
  protected final String TEXT_568 = "->";
  protected final String TEXT_569 = "())" + NL + "    {";
  protected final String TEXT_570 = NL + "      return $wasRemoved;" + NL + "    }" + NL + "" + NL + "    //";
  protected final String TEXT_571 = " already at minimum (";
  protected final String TEXT_572 = ")" + NL + "    if ($this->";
  protected final String TEXT_573 = "() <= self::";
  protected final String TEXT_574 = "())" + NL + "    {";
  protected final String TEXT_575 = NL + "      return $wasRemoved;" + NL + "    }" + NL + "" + NL + "    unset($this->";
  protected final String TEXT_576 = "[$this->";
  protected final String TEXT_577 = "($";
  protected final String TEXT_578 = ")]);" + NL + "    $this->";
  protected final String TEXT_579 = " = array_values($this->";
  protected final String TEXT_580 = ");" + NL + "    $wasRemoved = true;";
  protected final String TEXT_581 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  protected final String TEXT_582 = NL + "  public function ";
  protected final String TEXT_583 = "(";
  protected final String TEXT_584 = ")" + NL + "  {" + NL + "    if ($this->";
  protected final String TEXT_585 = "() >= self::";
  protected final String TEXT_586 = "())" + NL + "    {" + NL + "      return null;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      return new ";
  protected final String TEXT_587 = "(";
  protected final String TEXT_588 = ");" + NL + "    }" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_589 = "($";
  protected final String TEXT_590 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  protected final String TEXT_591 = NL + "    if ($this->";
  protected final String TEXT_592 = "() >= self::";
  protected final String TEXT_593 = "())" + NL + "    {";
  protected final String TEXT_594 = NL + "      return $wasAdded;" + NL + "    }" + NL + "" + NL + "    $";
  protected final String TEXT_595 = " = $";
  protected final String TEXT_596 = "->";
  protected final String TEXT_597 = "();" + NL + "    $";
  protected final String TEXT_598 = " = $";
  protected final String TEXT_599 = " != null && $this !== $";
  protected final String TEXT_600 = ";" + NL + "    if ($";
  protected final String TEXT_601 = ")" + NL + "    {" + NL + "      $";
  protected final String TEXT_602 = "->";
  protected final String TEXT_603 = "($this);" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $this->";
  protected final String TEXT_604 = "[] = $";
  protected final String TEXT_605 = ";" + NL + "    }" + NL + "    $wasAdded = true;";
  protected final String TEXT_606 = NL + "    return $wasAdded;" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_607 = "($";
  protected final String TEXT_608 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  protected final String TEXT_609 = NL + "    //Unable to remove ";
  protected final String TEXT_610 = ", as it must always have a ";
  protected final String TEXT_611 = NL + "    if ($this !== $";
  protected final String TEXT_612 = "->";
  protected final String TEXT_613 = "())" + NL + "    {" + NL + "      unset($this->";
  protected final String TEXT_614 = "[$this->";
  protected final String TEXT_615 = "($";
  protected final String TEXT_616 = ")]);" + NL + "      $this->";
  protected final String TEXT_617 = " = array_values($this->";
  protected final String TEXT_618 = ");" + NL + "      $wasRemoved = true;" + NL + "    }";
  protected final String TEXT_619 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  protected final String TEXT_620 = NL + "  public function ";
  protected final String TEXT_621 = "($";
  protected final String TEXT_622 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_623 = NL + "    $";
  protected final String TEXT_624 = " = array();" + NL + "    foreach ($";
  protected final String TEXT_625 = " as $";
  protected final String TEXT_626 = ")" + NL + "    {" + NL + "      if (array_search($";
  protected final String TEXT_627 = ",$";
  protected final String TEXT_628 = ") !== false)" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      $";
  protected final String TEXT_629 = "[] = $";
  protected final String TEXT_630 = ";" + NL + "    }" + NL + "" + NL + "    if (count($";
  protected final String TEXT_631 = ") != count($";
  protected final String TEXT_632 = ") || count($";
  protected final String TEXT_633 = ") > self::";
  protected final String TEXT_634 = "())" + NL + "    {";
  protected final String TEXT_635 = NL + "      return $wasSet;" + NL + "    }" + NL + "" + NL + "    $";
  protected final String TEXT_636 = " = $this->";
  protected final String TEXT_637 = ";" + NL + "    $this->";
  protected final String TEXT_638 = " = array();" + NL + "    foreach ($";
  protected final String TEXT_639 = " as $";
  protected final String TEXT_640 = ")" + NL + "    {" + NL + "      $this->";
  protected final String TEXT_641 = "[] = $";
  protected final String TEXT_642 = ";" + NL + "      $removeIndex = array_search($";
  protected final String TEXT_643 = ",$";
  protected final String TEXT_644 = ");" + NL + "      if ($removeIndex !== false)" + NL + "      {" + NL + "        unset($";
  protected final String TEXT_645 = "[$removeIndex]);" + NL + "        $";
  protected final String TEXT_646 = " = array_values($";
  protected final String TEXT_647 = ");" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        $";
  protected final String TEXT_648 = "->";
  protected final String TEXT_649 = "($this);" + NL + "      }" + NL + "    }" + NL + "" + NL + "    foreach ($";
  protected final String TEXT_650 = " as $";
  protected final String TEXT_651 = ")" + NL + "    {" + NL + "      $";
  protected final String TEXT_652 = "->";
  protected final String TEXT_653 = "($this);" + NL + "    }" + NL + "    $wasSet = true;";
  protected final String TEXT_654 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_655 = NL + "  public function ";
  protected final String TEXT_656 = "(";
  protected final String TEXT_657 = ")" + NL + "  {" + NL + "    return new ";
  protected final String TEXT_658 = "(";
  protected final String TEXT_659 = ");" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_660 = "($";
  protected final String TEXT_661 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  protected final String TEXT_662 = NL + "    $";
  protected final String TEXT_663 = " = $";
  protected final String TEXT_664 = "->";
  protected final String TEXT_665 = "();" + NL + "    $";
  protected final String TEXT_666 = " = $";
  protected final String TEXT_667 = " != null && $this !== $";
  protected final String TEXT_668 = ";" + NL + "    if ($";
  protected final String TEXT_669 = ")" + NL + "    {" + NL + "      $";
  protected final String TEXT_670 = "->";
  protected final String TEXT_671 = "($this);" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $this->";
  protected final String TEXT_672 = "[] = $";
  protected final String TEXT_673 = ";" + NL + "    }" + NL + "    $wasAdded = true;";
  protected final String TEXT_674 = NL + "    return $wasAdded;" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_675 = "($";
  protected final String TEXT_676 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  protected final String TEXT_677 = NL + "    //Unable to remove ";
  protected final String TEXT_678 = ", as it must always have a ";
  protected final String TEXT_679 = NL + "    if ($this !== $";
  protected final String TEXT_680 = "->";
  protected final String TEXT_681 = "())" + NL + "    {" + NL + "      unset($this->";
  protected final String TEXT_682 = "[$this->";
  protected final String TEXT_683 = "($";
  protected final String TEXT_684 = ")]);" + NL + "      $this->";
  protected final String TEXT_685 = " = array_values($this->";
  protected final String TEXT_686 = ");" + NL + "      $wasRemoved = true;" + NL + "    }";
  protected final String TEXT_687 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  protected final String TEXT_688 = NL + "  public function ";
  protected final String TEXT_689 = "($";
  protected final String TEXT_690 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_691 = NL + "    if ($";
  protected final String TEXT_692 = " == null)" + NL + "    {" + NL + "      $";
  protected final String TEXT_693 = " = $this->";
  protected final String TEXT_694 = ";" + NL + "      $this->";
  protected final String TEXT_695 = " = null;" + NL + "      " + NL + "      if ($";
  protected final String TEXT_696 = " != null && $";
  protected final String TEXT_697 = "->";
  protected final String TEXT_698 = "() != null)" + NL + "      {" + NL + "        $";
  protected final String TEXT_699 = "->";
  protected final String TEXT_700 = "(null);" + NL + "      }" + NL + "      $wasSet = true;";
  protected final String TEXT_701 = NL + "      return $wasSet;" + NL + "    }" + NL + "    " + NL + "    $";
  protected final String TEXT_702 = " = $this->";
  protected final String TEXT_703 = "();" + NL + "    if ($";
  protected final String TEXT_704 = " != null && $";
  protected final String TEXT_705 = " != $";
  protected final String TEXT_706 = ")" + NL + "    {" + NL + "      $";
  protected final String TEXT_707 = "->";
  protected final String TEXT_708 = "(null);" + NL + "    }" + NL + "    " + NL + "    $this->";
  protected final String TEXT_709 = " = $";
  protected final String TEXT_710 = ";" + NL + "    $";
  protected final String TEXT_711 = " = $";
  protected final String TEXT_712 = "->";
  protected final String TEXT_713 = "();" + NL + "    " + NL + "    if ($this != $";
  protected final String TEXT_714 = ")" + NL + "    {" + NL + "      $";
  protected final String TEXT_715 = "->";
  protected final String TEXT_716 = "($this);" + NL + "    }" + NL + "    $wasSet = true;";
  protected final String TEXT_717 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_718 = NL + "  public function ";
  protected final String TEXT_719 = "($";
  protected final String TEXT_720 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  protected final String TEXT_721 = NL + "    if ($this->";
  protected final String TEXT_722 = "($";
  protected final String TEXT_723 = ") == -1)" + NL + "    {";
  protected final String TEXT_724 = NL + "      return $wasRemoved;" + NL + "    }" + NL + "" + NL + "    if ($this->";
  protected final String TEXT_725 = "() <= self::";
  protected final String TEXT_726 = "())" + NL + "    {";
  protected final String TEXT_727 = NL + "      return $wasRemoved;" + NL + "    }" + NL + "" + NL + "    $oldIndex = $this->";
  protected final String TEXT_728 = "($";
  protected final String TEXT_729 = ");" + NL + "    unset($this->";
  protected final String TEXT_730 = "[$oldIndex]);" + NL + "    if ($";
  protected final String TEXT_731 = "->";
  protected final String TEXT_732 = "($this) == -1)" + NL + "    {" + NL + "      $wasRemoved = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $wasRemoved = $";
  protected final String TEXT_733 = "->";
  protected final String TEXT_734 = "($this);" + NL + "      if (!$wasRemoved)" + NL + "      {" + NL + "        $this->";
  protected final String TEXT_735 = "[$oldIndex] = $";
  protected final String TEXT_736 = ";" + NL + "        ksort($this->";
  protected final String TEXT_737 = ");" + NL + "      }" + NL + "    }" + NL + "    $this->";
  protected final String TEXT_738 = " = array_values($this->";
  protected final String TEXT_739 = ");";
  protected final String TEXT_740 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  protected final String TEXT_741 = NL + "  public function ";
  protected final String TEXT_742 = "($";
  protected final String TEXT_743 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  protected final String TEXT_744 = NL + "    if ($this->";
  protected final String TEXT_745 = "($";
  protected final String TEXT_746 = ") == -1)" + NL + "    {";
  protected final String TEXT_747 = NL + "      return $wasRemoved;" + NL + "    }" + NL + "" + NL + "    if ($this->";
  protected final String TEXT_748 = "() <= self::";
  protected final String TEXT_749 = "())" + NL + "    {";
  protected final String TEXT_750 = NL + "      return $wasRemoved;" + NL + "    }" + NL + "" + NL + "    $oldIndex = $this->";
  protected final String TEXT_751 = "($";
  protected final String TEXT_752 = ");" + NL + "    unset($this->";
  protected final String TEXT_753 = "[$oldIndex]);" + NL + "    if ($";
  protected final String TEXT_754 = "->";
  protected final String TEXT_755 = "($this) == -1)" + NL + "    {" + NL + "      $wasRemoved = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $wasRemoved = $";
  protected final String TEXT_756 = "->";
  protected final String TEXT_757 = "($this);" + NL + "      if (!$wasRemoved)" + NL + "      {" + NL + "        $this->";
  protected final String TEXT_758 = "[$oldIndex] = $";
  protected final String TEXT_759 = ";" + NL + "        ksort($this->";
  protected final String TEXT_760 = ");" + NL + "      }" + NL + "    }" + NL + "    $this->";
  protected final String TEXT_761 = " = array_values($this->";
  protected final String TEXT_762 = ");";
  protected final String TEXT_763 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  protected final String TEXT_764 = NL + "  public function ";
  protected final String TEXT_765 = "($";
  protected final String TEXT_766 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_767 = NL + "    if ($";
  protected final String TEXT_768 = " != null && $";
  protected final String TEXT_769 = "->";
  protected final String TEXT_770 = "() >= ";
  protected final String TEXT_771 = "::";
  protected final String TEXT_772 = "())" + NL + "    {";
  protected final String TEXT_773 = NL + "      return $wasSet;" + NL + "    }" + NL + "" + NL + "    $";
  protected final String TEXT_774 = " = $this->";
  protected final String TEXT_775 = ";" + NL + "    $this->";
  protected final String TEXT_776 = " = $";
  protected final String TEXT_777 = ";" + NL + "    if ($";
  protected final String TEXT_778 = " != null && $";
  protected final String TEXT_779 = " != $";
  protected final String TEXT_780 = ")" + NL + "    {" + NL + "      $";
  protected final String TEXT_781 = "->";
  protected final String TEXT_782 = "($this);" + NL + "    }" + NL + "    if ($";
  protected final String TEXT_783 = " != null)" + NL + "    {" + NL + "      $";
  protected final String TEXT_784 = "->";
  protected final String TEXT_785 = "($this);" + NL + "    }" + NL + "    $wasSet = true;";
  protected final String TEXT_786 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_787 = NL + "  public function ";
  protected final String TEXT_788 = "($";
  protected final String TEXT_789 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_790 = NL + "    if ($";
  protected final String TEXT_791 = " == null)" + NL + "    {";
  protected final String TEXT_792 = NL + "      return $wasSet;" + NL + "    }" + NL + "    " + NL + "    $";
  protected final String TEXT_793 = " = $this->";
  protected final String TEXT_794 = ";" + NL + "    $this->";
  protected final String TEXT_795 = " = $";
  protected final String TEXT_796 = ";" + NL + "    if ($";
  protected final String TEXT_797 = " != null && $";
  protected final String TEXT_798 = " != $";
  protected final String TEXT_799 = ")" + NL + "    {" + NL + "      $";
  protected final String TEXT_800 = "->";
  protected final String TEXT_801 = "($this);" + NL + "    }" + NL + "    $this->";
  protected final String TEXT_802 = "->";
  protected final String TEXT_803 = "($this);" + NL + "    $wasSet = true;";
  protected final String TEXT_804 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_805 = NL + "  public function ";
  protected final String TEXT_806 = "($";
  protected final String TEXT_807 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_808 = NL + "    //Must provide ";
  protected final String TEXT_809 = " to ";
  protected final String TEXT_810 = NL + "    if ($";
  protected final String TEXT_811 = " == null)" + NL + "    {";
  protected final String TEXT_812 = NL + "      return $wasSet;" + NL + "    }" + NL + "" + NL + "    //";
  protected final String TEXT_813 = " already at maximum (";
  protected final String TEXT_814 = ")" + NL + "    if ($";
  protected final String TEXT_815 = "->";
  protected final String TEXT_816 = "() >= ";
  protected final String TEXT_817 = "::";
  protected final String TEXT_818 = "())" + NL + "    {";
  protected final String TEXT_819 = NL + "      return $wasSet;" + NL + "    }" + NL + "    " + NL + "    $";
  protected final String TEXT_820 = " = $this->";
  protected final String TEXT_821 = ";" + NL + "    $this->";
  protected final String TEXT_822 = " = $";
  protected final String TEXT_823 = ";" + NL + "    if ($";
  protected final String TEXT_824 = " != null && $";
  protected final String TEXT_825 = " != $";
  protected final String TEXT_826 = ")" + NL + "    {" + NL + "      $didRemove = $";
  protected final String TEXT_827 = "->";
  protected final String TEXT_828 = "($this);" + NL + "      if (!$didRemove)" + NL + "      {" + NL + "        $this->";
  protected final String TEXT_829 = " = $";
  protected final String TEXT_830 = ";";
  protected final String TEXT_831 = NL + "        return $wasSet;" + NL + "      }" + NL + "    }" + NL + "    $this->";
  protected final String TEXT_832 = "->";
  protected final String TEXT_833 = "($this);" + NL + "    $wasSet = true;";
  protected final String TEXT_834 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_835 = NL + "  public function ";
  protected final String TEXT_836 = "($";
  protected final String TEXT_837 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_838 = NL + "    //Must provide ";
  protected final String TEXT_839 = " to ";
  protected final String TEXT_840 = NL + "    if ($";
  protected final String TEXT_841 = " == null)" + NL + "    {";
  protected final String TEXT_842 = NL + "      return $wasSet;" + NL + "    }" + NL + "" + NL + "    if ($this->";
  protected final String TEXT_843 = " != null && $this->";
  protected final String TEXT_844 = "->";
  protected final String TEXT_845 = "() <= ";
  protected final String TEXT_846 = "::";
  protected final String TEXT_847 = "())" + NL + "    {";
  protected final String TEXT_848 = NL + "      return $wasSet;" + NL + "    }" + NL + "" + NL + "    $";
  protected final String TEXT_849 = " = $this->";
  protected final String TEXT_850 = ";" + NL + "    $this->";
  protected final String TEXT_851 = " = $";
  protected final String TEXT_852 = ";" + NL + "    if ($";
  protected final String TEXT_853 = " != null && $";
  protected final String TEXT_854 = " != $";
  protected final String TEXT_855 = ")" + NL + "    {" + NL + "      $didRemove = $";
  protected final String TEXT_856 = "->";
  protected final String TEXT_857 = "($this);" + NL + "      if (!$didRemove)" + NL + "      {" + NL + "        $this->";
  protected final String TEXT_858 = " = $";
  protected final String TEXT_859 = ";";
  protected final String TEXT_860 = NL + "        return $wasSet;" + NL + "      }" + NL + "    }" + NL + "    $this->";
  protected final String TEXT_861 = "->";
  protected final String TEXT_862 = "($this);" + NL + "    $wasSet = true;";
  protected final String TEXT_863 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_864 = NL + "  public function ";
  protected final String TEXT_865 = "($";
  protected final String TEXT_866 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  protected final String TEXT_867 = NL + "    $";
  protected final String TEXT_868 = " = $";
  protected final String TEXT_869 = "->";
  protected final String TEXT_870 = "();" + NL + "    if ($";
  protected final String TEXT_871 = " == null)" + NL + "    {" + NL + "      $";
  protected final String TEXT_872 = "->";
  protected final String TEXT_873 = "($this);" + NL + "    }" + NL + "    elseif ($this !== $";
  protected final String TEXT_874 = ")" + NL + "    {" + NL + "      $";
  protected final String TEXT_875 = "->";
  protected final String TEXT_876 = "($";
  protected final String TEXT_877 = ");" + NL + "      $this->";
  protected final String TEXT_878 = "($";
  protected final String TEXT_879 = ");" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $this->";
  protected final String TEXT_880 = "[] = $";
  protected final String TEXT_881 = ";" + NL + "    }" + NL + "    $wasAdded = true;";
  protected final String TEXT_882 = NL + "    return $wasAdded;" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_883 = "($";
  protected final String TEXT_884 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  protected final String TEXT_885 = NL + "    if ($this->";
  protected final String TEXT_886 = "($";
  protected final String TEXT_887 = ") != -1)" + NL + "    {" + NL + "      unset($this->";
  protected final String TEXT_888 = "[$this->";
  protected final String TEXT_889 = "($";
  protected final String TEXT_890 = ")]);" + NL + "      $this->";
  protected final String TEXT_891 = " = array_values($this->";
  protected final String TEXT_892 = ");" + NL + "      if ($this === $";
  protected final String TEXT_893 = "->";
  protected final String TEXT_894 = "())" + NL + "      {" + NL + "        $";
  protected final String TEXT_895 = "->";
  protected final String TEXT_896 = "(null);" + NL + "      }" + NL + "      $wasRemoved = true;" + NL + "    }";
  protected final String TEXT_897 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  protected final String TEXT_898 = NL + "  public function ";
  protected final String TEXT_899 = "($";
  protected final String TEXT_900 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_901 = NL + "    $";
  protected final String TEXT_902 = " = $this->";
  protected final String TEXT_903 = ";" + NL + "    $this->";
  protected final String TEXT_904 = " = $";
  protected final String TEXT_905 = ";" + NL + "    if ($";
  protected final String TEXT_906 = " != null && $";
  protected final String TEXT_907 = " !== $";
  protected final String TEXT_908 = ")" + NL + "    {" + NL + "      $";
  protected final String TEXT_909 = "->";
  protected final String TEXT_910 = "($this);" + NL + "    }" + NL + "    if ($";
  protected final String TEXT_911 = " != null && $";
  protected final String TEXT_912 = " !== $";
  protected final String TEXT_913 = ")" + NL + "    {" + NL + "      $";
  protected final String TEXT_914 = "->";
  protected final String TEXT_915 = "($this);" + NL + "    }" + NL + "    $wasSet = true;";
  protected final String TEXT_916 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_917 = NL + "  public function ";
  protected final String TEXT_918 = "($";
  protected final String TEXT_919 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  protected final String TEXT_920 = NL + "    if ($this->";
  protected final String TEXT_921 = "() >= self::";
  protected final String TEXT_922 = "())" + NL + "    {";
  protected final String TEXT_923 = NL + "      return $wasAdded;" + NL + "    }" + NL + "" + NL + "    $";
  protected final String TEXT_924 = " = $";
  protected final String TEXT_925 = "->";
  protected final String TEXT_926 = "();" + NL + "    if ($";
  protected final String TEXT_927 = " == null)" + NL + "    {" + NL + "      $";
  protected final String TEXT_928 = "->";
  protected final String TEXT_929 = "($this);" + NL + "    }" + NL + "    else if ($this !== $";
  protected final String TEXT_930 = ")" + NL + "    {" + NL + "      $";
  protected final String TEXT_931 = "->";
  protected final String TEXT_932 = "($";
  protected final String TEXT_933 = ");" + NL + "      $this->";
  protected final String TEXT_934 = "($";
  protected final String TEXT_935 = ");" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      $this->";
  protected final String TEXT_936 = "[] = $";
  protected final String TEXT_937 = ";" + NL + "    }" + NL + "    $wasAdded = true;";
  protected final String TEXT_938 = NL + "    return $wasAdded;" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_939 = "($";
  protected final String TEXT_940 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  protected final String TEXT_941 = NL + "    if ($this->";
  protected final String TEXT_942 = "($";
  protected final String TEXT_943 = ") != -1)" + NL + "    {" + NL + "      unset($this->";
  protected final String TEXT_944 = "[$this->";
  protected final String TEXT_945 = "($";
  protected final String TEXT_946 = ")]);" + NL + "      $this->";
  protected final String TEXT_947 = " = array_values($this->";
  protected final String TEXT_948 = ");" + NL + "      $";
  protected final String TEXT_949 = "->";
  protected final String TEXT_950 = "(null);" + NL + "      $wasRemoved = true;" + NL + "    }";
  protected final String TEXT_951 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  protected final String TEXT_952 = NL + "  public function ";
  protected final String TEXT_953 = "($";
  protected final String TEXT_954 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  protected final String TEXT_955 = NL + "    if ($this->";
  protected final String TEXT_956 = "() < self::";
  protected final String TEXT_957 = "())" + NL + "    {" + NL + "      $this->";
  protected final String TEXT_958 = "[] = $";
  protected final String TEXT_959 = ";" + NL + "      $wasAdded = true;" + NL + "    }";
  protected final String TEXT_960 = NL + "    return $wasAdded;" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_961 = "($";
  protected final String TEXT_962 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  protected final String TEXT_963 = NL + "    if ($this->";
  protected final String TEXT_964 = "($";
  protected final String TEXT_965 = ") == -1)" + NL + "    {";
  protected final String TEXT_966 = NL + "      return $wasRemoved;" + NL + "    }" + NL + "" + NL + "    if ($this->";
  protected final String TEXT_967 = "() <= self::";
  protected final String TEXT_968 = "())" + NL + "    {";
  protected final String TEXT_969 = NL + "      return $wasRemoved;" + NL + "    }" + NL + "" + NL + "    unset($this->";
  protected final String TEXT_970 = "[$this->";
  protected final String TEXT_971 = "($";
  protected final String TEXT_972 = ")]);" + NL + "    $this->";
  protected final String TEXT_973 = " = array_values($this->";
  protected final String TEXT_974 = ");" + NL + "    $wasRemoved = true;";
  protected final String TEXT_975 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  protected final String TEXT_976 = NL + "  public function ";
  protected final String TEXT_977 = "($";
  protected final String TEXT_978 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  protected final String TEXT_979 = NL + "    if ($this->";
  protected final String TEXT_980 = "() >= self::";
  protected final String TEXT_981 = "())" + NL + "    {";
  protected final String TEXT_982 = NL + "      return $wasAdded;" + NL + "    }";
  protected final String TEXT_983 = NL + "    $";
  protected final String TEXT_984 = " = $";
  protected final String TEXT_985 = "->";
  protected final String TEXT_986 = "();" + NL + "    if ($";
  protected final String TEXT_987 = " != null && $";
  protected final String TEXT_988 = "->";
  protected final String TEXT_989 = "() <= self::";
  protected final String TEXT_990 = "())" + NL + "    {";
  protected final String TEXT_991 = NL + "      return $wasAdded;" + NL + "    }" + NL + "    else if ($";
  protected final String TEXT_992 = " != null)" + NL + "    {" + NL + "      unset($";
  protected final String TEXT_993 = "->";
  protected final String TEXT_994 = "[$";
  protected final String TEXT_995 = "->";
  protected final String TEXT_996 = "($";
  protected final String TEXT_997 = ")]);" + NL + "      $";
  protected final String TEXT_998 = "->";
  protected final String TEXT_999 = " = array_values($";
  protected final String TEXT_1000 = "->";
  protected final String TEXT_1001 = ");" + NL + "    }" + NL + "    $this->";
  protected final String TEXT_1002 = "[] = $";
  protected final String TEXT_1003 = ";" + NL + "    $this->";
  protected final String TEXT_1004 = "($";
  protected final String TEXT_1005 = ",$this);" + NL + "    $wasAdded = true;";
  protected final String TEXT_1006 = NL + "    return $wasAdded;" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_1007 = "($";
  protected final String TEXT_1008 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  protected final String TEXT_1009 = NL + "    if ($this->";
  protected final String TEXT_1010 = "($";
  protected final String TEXT_1011 = ") != -1 && $this->";
  protected final String TEXT_1012 = "() > self::";
  protected final String TEXT_1013 = "())" + NL + "    {" + NL + "      unset($this->";
  protected final String TEXT_1014 = "[$this->";
  protected final String TEXT_1015 = "($";
  protected final String TEXT_1016 = ")]);" + NL + "      $this->";
  protected final String TEXT_1017 = " = array_values($this->";
  protected final String TEXT_1018 = ");" + NL + "      $this->";
  protected final String TEXT_1019 = "($";
  protected final String TEXT_1020 = ",null);" + NL + "      $wasRemoved = true;" + NL + "    }";
  protected final String TEXT_1021 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  protected final String TEXT_1022 = NL + "  public function ";
  protected final String TEXT_1023 = "($";
  protected final String TEXT_1024 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_1025 = NL + "    $";
  protected final String TEXT_1026 = " = array();" + NL + "    foreach ($";
  protected final String TEXT_1027 = " as $";
  protected final String TEXT_1028 = ")" + NL + "    {" + NL + "      if (array_search($";
  protected final String TEXT_1029 = ",$";
  protected final String TEXT_1030 = ") !== false)" + NL + "      {";
  protected final String TEXT_1031 = NL + "        return $wasSet;" + NL + "      }" + NL + "      else if ($";
  protected final String TEXT_1032 = "->";
  protected final String TEXT_1033 = "() != null && $this !== $";
  protected final String TEXT_1034 = "->";
  protected final String TEXT_1035 = "())" + NL + "      {";
  protected final String TEXT_1036 = NL + "        return $wasSet;" + NL + "      }" + NL + "      $";
  protected final String TEXT_1037 = "[] = $";
  protected final String TEXT_1038 = ";" + NL + "    }" + NL + "" + NL + "    if (count($";
  protected final String TEXT_1039 = ") != self::";
  protected final String TEXT_1040 = "())" + NL + "    {";
  protected final String TEXT_1041 = NL + "      return $wasSet;" + NL + "    }" + NL + "" + NL + "    foreach ($this->";
  protected final String TEXT_1042 = " as $orphan) " + NL + "    {" + NL + "      $wasFound = false;" + NL + "      foreach ($";
  protected final String TEXT_1043 = " as $fosterCare)" + NL + "      {" + NL + "        if ($orphan == $fosterCare)" + NL + "        {" + NL + "          $wasFound = true;" + NL + "          break;" + NL + "        }" + NL + "      }" + NL + "" + NL + "      if (!$wasFound)" + NL + "      {" + NL + "        $this->";
  protected final String TEXT_1044 = "($orphan, null);" + NL + "      }" + NL + "    }" + NL + "" + NL + "    $this->";
  protected final String TEXT_1045 = " = array();" + NL + "    foreach ($";
  protected final String TEXT_1046 = " as $";
  protected final String TEXT_1047 = ")" + NL + "    {" + NL + "      $this->";
  protected final String TEXT_1048 = "($";
  protected final String TEXT_1049 = ", $this);" + NL + "      $this->";
  protected final String TEXT_1050 = "[] = $";
  protected final String TEXT_1051 = ";" + NL + "    }" + NL + "    $wasSet = true;";
  protected final String TEXT_1052 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_1053 = NL + "  private function ";
  protected final String TEXT_1054 = "($";
  protected final String TEXT_1055 = ", $";
  protected final String TEXT_1056 = ")" + NL + "  {" + NL + "    $";
  protected final String TEXT_1057 = "->mentor = $";
  protected final String TEXT_1058 = ";" + NL + "    //$prop = new ReflectionProperty($";
  protected final String TEXT_1059 = ", '";
  protected final String TEXT_1060 = "');" + NL + "    //$prop->setAccessible(true);" + NL + "    //$prop->setValue($";
  protected final String TEXT_1061 = ",$";
  protected final String TEXT_1062 = ");" + NL + "    //$prop->setAccessible(false);" + NL + "  }" + NL;
  protected final String TEXT_1063 = NL + "  public function ";
  protected final String TEXT_1064 = "($";
  protected final String TEXT_1065 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  protected final String TEXT_1066 = NL + "    $this->";
  protected final String TEXT_1067 = "[] = $";
  protected final String TEXT_1068 = ";" + NL + "    $wasAdded = true;";
  protected final String TEXT_1069 = NL + "    return $wasAdded;" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_1070 = "($";
  protected final String TEXT_1071 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  protected final String TEXT_1072 = NL + "    if ($this->";
  protected final String TEXT_1073 = "($";
  protected final String TEXT_1074 = ") != -1)" + NL + "    {" + NL + "      unset($this->";
  protected final String TEXT_1075 = "[$this->";
  protected final String TEXT_1076 = "($";
  protected final String TEXT_1077 = ")]);" + NL + "      $this->";
  protected final String TEXT_1078 = " = array_values($this->";
  protected final String TEXT_1079 = ");" + NL + "      $wasRemoved = true;" + NL + "    }";
  protected final String TEXT_1080 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  protected final String TEXT_1081 = NL + "  public function ";
  protected final String TEXT_1082 = "($";
  protected final String TEXT_1083 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  protected final String TEXT_1084 = NL + "    if ($this->";
  protected final String TEXT_1085 = "() < self::";
  protected final String TEXT_1086 = "())" + NL + "    {" + NL + "      $this->";
  protected final String TEXT_1087 = "[] = $";
  protected final String TEXT_1088 = ";" + NL + "      $wasAdded = true;" + NL + "    }";
  protected final String TEXT_1089 = NL + "    return $wasAdded;" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_1090 = "($";
  protected final String TEXT_1091 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  protected final String TEXT_1092 = NL + "    if ($this->";
  protected final String TEXT_1093 = "($";
  protected final String TEXT_1094 = ") != -1)" + NL + "    {" + NL + "      unset($this->";
  protected final String TEXT_1095 = "[$this->";
  protected final String TEXT_1096 = "($";
  protected final String TEXT_1097 = ")]);" + NL + "      $this->";
  protected final String TEXT_1098 = " = array_values($this->";
  protected final String TEXT_1099 = ");" + NL + "      $wasRemoved = true;" + NL + "    }";
  protected final String TEXT_1100 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  protected final String TEXT_1101 = NL + "  public function ";
  protected final String TEXT_1102 = "($";
  protected final String TEXT_1103 = ")" + NL + "  {" + NL + "    $wasAdded = false;";
  protected final String TEXT_1104 = NL + "    $this->";
  protected final String TEXT_1105 = "[] = $";
  protected final String TEXT_1106 = ";" + NL + "    $wasAdded = true;";
  protected final String TEXT_1107 = NL + "    return $wasAdded;" + NL + "  }" + NL + "" + NL + "  public function ";
  protected final String TEXT_1108 = "($";
  protected final String TEXT_1109 = ")" + NL + "  {" + NL + "    $wasRemoved = false;";
  protected final String TEXT_1110 = NL + "    if ($this->";
  protected final String TEXT_1111 = "($";
  protected final String TEXT_1112 = ") == -1)" + NL + "    {";
  protected final String TEXT_1113 = NL + "      return $wasRemoved;" + NL + "    }" + NL + "" + NL + "    if ($this->";
  protected final String TEXT_1114 = "() <= self::";
  protected final String TEXT_1115 = "())" + NL + "    {";
  protected final String TEXT_1116 = NL + "      return $wasRemoved;" + NL + "    }" + NL + "" + NL + "    unset($this->";
  protected final String TEXT_1117 = "[$this->";
  protected final String TEXT_1118 = "($";
  protected final String TEXT_1119 = ")]);" + NL + "    $this->";
  protected final String TEXT_1120 = " = array_values($this->";
  protected final String TEXT_1121 = ");" + NL + "    $wasRemoved = true;";
  protected final String TEXT_1122 = NL + "    return $wasRemoved;" + NL + "  }" + NL;
  protected final String TEXT_1123 = NL + "  public function ";
  protected final String TEXT_1124 = "($";
  protected final String TEXT_1125 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_1126 = NL + "    $";
  protected final String TEXT_1127 = " = array();" + NL + "    foreach ($";
  protected final String TEXT_1128 = " as $";
  protected final String TEXT_1129 = ")" + NL + "    {" + NL + "      if (array_search($";
  protected final String TEXT_1130 = ",$";
  protected final String TEXT_1131 = ") !== false)" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      $";
  protected final String TEXT_1132 = "[] = $";
  protected final String TEXT_1133 = ";" + NL + "    }" + NL + "" + NL + "    if (count($";
  protected final String TEXT_1134 = ") != count($";
  protected final String TEXT_1135 = ") || count($";
  protected final String TEXT_1136 = ") != self::";
  protected final String TEXT_1137 = "())" + NL + "    {";
  protected final String TEXT_1138 = NL + "      return $wasSet;" + NL + "    }" + NL + "" + NL + "    $this->";
  protected final String TEXT_1139 = " = $";
  protected final String TEXT_1140 = ";" + NL + "    $wasSet = true;";
  protected final String TEXT_1141 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_1142 = NL + "  public function ";
  protected final String TEXT_1143 = "($";
  protected final String TEXT_1144 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_1145 = NL + "    $";
  protected final String TEXT_1146 = " = array();" + NL + "    foreach ($";
  protected final String TEXT_1147 = " as $";
  protected final String TEXT_1148 = ")" + NL + "    {" + NL + "      if (array_search($";
  protected final String TEXT_1149 = ",$";
  protected final String TEXT_1150 = ") !== false)" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      $";
  protected final String TEXT_1151 = "[] = $";
  protected final String TEXT_1152 = ";" + NL + "    }" + NL + "" + NL + "    if (count($";
  protected final String TEXT_1153 = ") != count($";
  protected final String TEXT_1154 = ") || count($";
  protected final String TEXT_1155 = ") < self::";
  protected final String TEXT_1156 = "() || count($";
  protected final String TEXT_1157 = ") > self::";
  protected final String TEXT_1158 = "())" + NL + "    {";
  protected final String TEXT_1159 = NL + "      return $wasSet;" + NL + "    }" + NL + "" + NL + "    $";
  protected final String TEXT_1160 = " = $this->";
  protected final String TEXT_1161 = ";" + NL + "    $this->";
  protected final String TEXT_1162 = " = array();" + NL + "    foreach ($";
  protected final String TEXT_1163 = " as $";
  protected final String TEXT_1164 = ")" + NL + "    {" + NL + "      $this->";
  protected final String TEXT_1165 = "[] = $";
  protected final String TEXT_1166 = ";" + NL + "      $removeIndex = array_search($";
  protected final String TEXT_1167 = ",$";
  protected final String TEXT_1168 = ");" + NL + "      if ($removeIndex !== false)" + NL + "      {" + NL + "        unset($";
  protected final String TEXT_1169 = "[$removeIndex]);" + NL + "        $";
  protected final String TEXT_1170 = " = array_values($";
  protected final String TEXT_1171 = ");" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        $";
  protected final String TEXT_1172 = "->";
  protected final String TEXT_1173 = "($this);" + NL + "      }" + NL + "    }" + NL + "" + NL + "    foreach ($";
  protected final String TEXT_1174 = " as $";
  protected final String TEXT_1175 = ")" + NL + "    {" + NL + "      $";
  protected final String TEXT_1176 = "->";
  protected final String TEXT_1177 = "($this);" + NL + "    }" + NL + "    $wasSet = true;";
  protected final String TEXT_1178 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_1179 = NL + "  public function ";
  protected final String TEXT_1180 = "($";
  protected final String TEXT_1181 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_1182 = NL + "    $";
  protected final String TEXT_1183 = " = array();" + NL + "    foreach ($";
  protected final String TEXT_1184 = " as $";
  protected final String TEXT_1185 = ")" + NL + "    {" + NL + "      if (array_search($";
  protected final String TEXT_1186 = ",$";
  protected final String TEXT_1187 = ") !== false)" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      $";
  protected final String TEXT_1188 = "[] = $";
  protected final String TEXT_1189 = ";" + NL + "    }" + NL + "" + NL + "    if (count($";
  protected final String TEXT_1190 = ") != count($";
  protected final String TEXT_1191 = ") || count($";
  protected final String TEXT_1192 = ") < self::";
  protected final String TEXT_1193 = "())" + NL + "    {";
  protected final String TEXT_1194 = NL + "      return $wasSet;" + NL + "    }" + NL + "" + NL + "    $";
  protected final String TEXT_1195 = " = $this->";
  protected final String TEXT_1196 = ";" + NL + "    $this->";
  protected final String TEXT_1197 = " = array();" + NL + "    foreach ($";
  protected final String TEXT_1198 = " as $";
  protected final String TEXT_1199 = ")" + NL + "    {" + NL + "      $this->";
  protected final String TEXT_1200 = "[] = $";
  protected final String TEXT_1201 = ";" + NL + "      $removeIndex = array_search($";
  protected final String TEXT_1202 = ",$";
  protected final String TEXT_1203 = ");" + NL + "      if ($removeIndex !== false)" + NL + "      {" + NL + "        unset($";
  protected final String TEXT_1204 = "[$removeIndex]);" + NL + "        $";
  protected final String TEXT_1205 = " = array_values($";
  protected final String TEXT_1206 = ");" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        $";
  protected final String TEXT_1207 = "->";
  protected final String TEXT_1208 = "($this);" + NL + "      }" + NL + "    }" + NL + "" + NL + "    foreach ($";
  protected final String TEXT_1209 = " as $";
  protected final String TEXT_1210 = ")" + NL + "    {" + NL + "      $";
  protected final String TEXT_1211 = "->";
  protected final String TEXT_1212 = "($this);" + NL + "    }" + NL + "    $wasSet = true;";
  protected final String TEXT_1213 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_1214 = NL + "  public function ";
  protected final String TEXT_1215 = "($";
  protected final String TEXT_1216 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_1217 = NL + "    $";
  protected final String TEXT_1218 = " = array();" + NL + "    foreach ($";
  protected final String TEXT_1219 = " as $";
  protected final String TEXT_1220 = ")" + NL + "    {" + NL + "      if (array_search($";
  protected final String TEXT_1221 = ",$";
  protected final String TEXT_1222 = ") !== false)" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      $";
  protected final String TEXT_1223 = "[] = $";
  protected final String TEXT_1224 = ";" + NL + "    }" + NL + "" + NL + "    if (count($";
  protected final String TEXT_1225 = ") != count($";
  protected final String TEXT_1226 = ") || count($";
  protected final String TEXT_1227 = ") < self::";
  protected final String TEXT_1228 = "()  || count($";
  protected final String TEXT_1229 = ") > self::";
  protected final String TEXT_1230 = "())" + NL + "    {";
  protected final String TEXT_1231 = NL + "      return $wasSet;" + NL + "    }" + NL + "" + NL + "    $this->";
  protected final String TEXT_1232 = " = $";
  protected final String TEXT_1233 = ";" + NL + "    $wasSet = true;";
  protected final String TEXT_1234 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_1235 = NL + "  public function ";
  protected final String TEXT_1236 = "($";
  protected final String TEXT_1237 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_1238 = NL + "    if (count($";
  protected final String TEXT_1239 = ") < self::";
  protected final String TEXT_1240 = "()";
  protected final String TEXT_1241 = ")" + NL + "    {";
  protected final String TEXT_1242 = NL + "      return $wasSet;" + NL + "    }" + NL + "" + NL + "    $";
  protected final String TEXT_1243 = " = array();" + NL + "    $";
  protected final String TEXT_1244 = " = array();" + NL + "    foreach ($";
  protected final String TEXT_1245 = " as $";
  protected final String TEXT_1246 = ")" + NL + "    {" + NL + "      if (array_search($";
  protected final String TEXT_1247 = ",$";
  protected final String TEXT_1248 = ") !== false)" + NL + "      {";
  protected final String TEXT_1249 = NL + "        return $wasSet;" + NL + "      }" + NL + "      else if ($";
  protected final String TEXT_1250 = "->";
  protected final String TEXT_1251 = "() != null && $this !== $";
  protected final String TEXT_1252 = "->";
  protected final String TEXT_1253 = "())" + NL + "      {" + NL + "        $";
  protected final String TEXT_1254 = " = $";
  protected final String TEXT_1255 = "->";
  protected final String TEXT_1256 = "();" + NL + "        $";
  protected final String TEXT_1257 = " = serialize($";
  protected final String TEXT_1258 = ");" + NL + "        if (!array_key_exists($";
  protected final String TEXT_1259 = ", $";
  protected final String TEXT_1260 = "))" + NL + "        {" + NL + "          $";
  protected final String TEXT_1261 = "[$";
  protected final String TEXT_1262 = "] = $";
  protected final String TEXT_1263 = "->";
  protected final String TEXT_1264 = "();" + NL + "        }" + NL + "        $nextCount = $";
  protected final String TEXT_1265 = "[$";
  protected final String TEXT_1266 = "] - 1;" + NL + "        if ($nextCount < self::minimum";
  protected final String TEXT_1267 = "())" + NL + "        {";
  protected final String TEXT_1268 = NL + "          return $wasSet;" + NL + "        }" + NL + "        $";
  protected final String TEXT_1269 = "[$";
  protected final String TEXT_1270 = "] = $nextCount;" + NL + "      }" + NL + "      $";
  protected final String TEXT_1271 = "[] = $";
  protected final String TEXT_1272 = ";" + NL + "    }" + NL + "" + NL + "    foreach ($this->";
  protected final String TEXT_1273 = " as $orphan) " + NL + "    {" + NL + "      $wasFound = false;" + NL + "      foreach ($";
  protected final String TEXT_1274 = " as $fosterCare)" + NL + "      {" + NL + "        if ($orphan == $fosterCare)" + NL + "        {" + NL + "          $wasFound = true;" + NL + "          break;" + NL + "        }" + NL + "      }" + NL + "      " + NL + "      if (!$wasFound)" + NL + "      {" + NL + "        $this->";
  protected final String TEXT_1275 = "($orphan, null);" + NL + "      }" + NL + "    }" + NL + "" + NL + "    $this->";
  protected final String TEXT_1276 = " = array();" + NL + "    foreach ($";
  protected final String TEXT_1277 = " as $";
  protected final String TEXT_1278 = ")" + NL + "    {" + NL + "      if ($";
  protected final String TEXT_1279 = "->";
  protected final String TEXT_1280 = "() != null)" + NL + "      {" + NL + "        unset($";
  protected final String TEXT_1281 = "->";
  protected final String TEXT_1282 = "()->";
  protected final String TEXT_1283 = "[$";
  protected final String TEXT_1284 = "->";
  protected final String TEXT_1285 = "()->";
  protected final String TEXT_1286 = "($";
  protected final String TEXT_1287 = ")]);" + NL + "        $";
  protected final String TEXT_1288 = "->";
  protected final String TEXT_1289 = "()->";
  protected final String TEXT_1290 = " = array_values($";
  protected final String TEXT_1291 = "->";
  protected final String TEXT_1292 = "()->";
  protected final String TEXT_1293 = ");" + NL + "      }" + NL + "      $this->";
  protected final String TEXT_1294 = "($";
  protected final String TEXT_1295 = ", $this);" + NL + "      $this->";
  protected final String TEXT_1296 = "[] = $";
  protected final String TEXT_1297 = ";" + NL + "    }" + NL + "    $wasSet = true;";
  protected final String TEXT_1298 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_1299 = NL + "  private function ";
  protected final String TEXT_1300 = "($";
  protected final String TEXT_1301 = ", $";
  protected final String TEXT_1302 = ")" + NL + "  {" + NL + "    $";
  protected final String TEXT_1303 = "->mentor = $";
  protected final String TEXT_1304 = ";" + NL + "    //$prop = new ReflectionProperty($";
  protected final String TEXT_1305 = ", '";
  protected final String TEXT_1306 = "');" + NL + "    //$prop->setAccessible(true);" + NL + "    //$prop->setValue($";
  protected final String TEXT_1307 = ",$";
  protected final String TEXT_1308 = ");" + NL + "    //$prop->setAccessible(false);" + NL + "  }" + NL;
  protected final String TEXT_1309 = NL + "  public function ";
  protected final String TEXT_1310 = "($";
  protected final String TEXT_1311 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_1312 = NL + "    $";
  protected final String TEXT_1313 = " = array();" + NL + "    foreach ($";
  protected final String TEXT_1314 = " as $";
  protected final String TEXT_1315 = ")" + NL + "    {" + NL + "      if (array_search($";
  protected final String TEXT_1316 = ",$";
  protected final String TEXT_1317 = ") !== false)" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      $";
  protected final String TEXT_1318 = "[] = $";
  protected final String TEXT_1319 = ";" + NL + "    }" + NL + "" + NL + "    if (count($";
  protected final String TEXT_1320 = ") != count($";
  protected final String TEXT_1321 = ") || count($";
  protected final String TEXT_1322 = ") > self::";
  protected final String TEXT_1323 = "())" + NL + "    {";
  protected final String TEXT_1324 = NL + "      return $wasSet;" + NL + "    }" + NL + "" + NL + "    $this->";
  protected final String TEXT_1325 = " = $";
  protected final String TEXT_1326 = ";" + NL + "    $wasSet = true;";
  protected final String TEXT_1327 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_1328 = NL + "  public function ";
  protected final String TEXT_1329 = "($";
  protected final String TEXT_1330 = ")" + NL + "  {" + NL + "    $wasSet = false;";
  protected final String TEXT_1331 = NL + "    $";
  protected final String TEXT_1332 = " = array();" + NL + "    foreach ($";
  protected final String TEXT_1333 = " as $";
  protected final String TEXT_1334 = ")" + NL + "    {" + NL + "      if (array_search($";
  protected final String TEXT_1335 = ",$";
  protected final String TEXT_1336 = ") !== false)" + NL + "      {" + NL + "        continue;" + NL + "      }" + NL + "      $";
  protected final String TEXT_1337 = "[] = $";
  protected final String TEXT_1338 = ";" + NL + "    }" + NL + "" + NL + "    if (count($";
  protected final String TEXT_1339 = ") != count($";
  protected final String TEXT_1340 = ") || count($";
  protected final String TEXT_1341 = ") < self::";
  protected final String TEXT_1342 = "())" + NL + "    {";
  protected final String TEXT_1343 = NL + "      return $wasSet;" + NL + "    }" + NL + "" + NL + "    $this->";
  protected final String TEXT_1344 = " = $";
  protected final String TEXT_1345 = ";" + NL + "    $wasSet = true;";
  protected final String TEXT_1346 = NL + "    return $wasSet;" + NL + "  }" + NL;
  protected final String TEXT_1347 = NL + "  public function equals($compareTo)" + NL + "  {" + NL + "    if ($compareTo == null) { return false; }" + NL + "    if (get_class($this) != get_class($compareTo)) { return false; }" + NL;
  protected final String TEXT_1348 = NL + "    ";
  protected final String TEXT_1349 = NL + NL + "    return true;" + NL + "  }" + NL + "" + NL + "  public function hashCode()" + NL + "  {" + NL + "    if ($this->cachedHashCode != -1)" + NL + "    {" + NL + "      return $this->cachedHashCode;" + NL + "    }" + NL + "    $this->cachedHashCode = 17;";
  protected final String TEXT_1350 = NL + "    ";
  protected final String TEXT_1351 = NL;
  protected final String TEXT_1352 = NL + "    ";
  protected final String TEXT_1353 = NL + "    return $this->cachedHashCode;" + NL + "  }" + NL;
  protected final String TEXT_1354 = NL + "  public function equals($compareTo)" + NL + "  {" + NL + "    return $this == $compareTo;" + NL + "  }" + NL;
  protected final String TEXT_1355 = NL + "    $this->";
  protected final String TEXT_1356 = " = null;";
  protected final String TEXT_1357 = NL + "    $this->";
  protected final String TEXT_1358 = " = array();";
  protected final String TEXT_1359 = NL + "    $";
  protected final String TEXT_1360 = " = $this->";
  protected final String TEXT_1361 = ";" + NL + "    $this->";
  protected final String TEXT_1362 = " = null;" + NL + "    if ($";
  protected final String TEXT_1363 = " != null)" + NL + "    {" + NL + "      $";
  protected final String TEXT_1364 = "->delete();" + NL + "    }";
  protected final String TEXT_1365 = NL + "    if ($this->";
  protected final String TEXT_1366 = " != null)" + NL + "    {" + NL + "      $this->";
  protected final String TEXT_1367 = "->";
  protected final String TEXT_1368 = "(null);" + NL + "    }";
  protected final String TEXT_1369 = NL + "    $";
  protected final String TEXT_1370 = " = $this->";
  protected final String TEXT_1371 = ";" + NL + "    $this->";
  protected final String TEXT_1372 = " = null;" + NL + "    if ($";
  protected final String TEXT_1373 = " != null)" + NL + "    {" + NL + "      $";
  protected final String TEXT_1374 = "->";
  protected final String TEXT_1375 = "(null);" + NL + "    }";
  protected final String TEXT_1376 = NL + "    $";
  protected final String TEXT_1377 = " = $this->";
  protected final String TEXT_1378 = ";" + NL + "    $this->";
  protected final String TEXT_1379 = " = null;" + NL + "    if ($";
  protected final String TEXT_1380 = " != null)" + NL + "    {" + NL + "      $";
  protected final String TEXT_1381 = "->delete();" + NL + "    }";
  protected final String TEXT_1382 = NL + "    if ($this->";
  protected final String TEXT_1383 = " != null)" + NL + "    {" + NL + "      $this->";
  protected final String TEXT_1384 = "->";
  protected final String TEXT_1385 = "($this);" + NL + "    }";
  protected final String TEXT_1386 = NL + "    if ($this->";
  protected final String TEXT_1387 = " != null)" + NL + "    {" + NL + "      $this->";
  protected final String TEXT_1388 = "->delete();" + NL + "    }";
  protected final String TEXT_1389 = NL + "    if ($this->";
  protected final String TEXT_1390 = " != null)" + NL + "    {" + NL + "      if ($this->";
  protected final String TEXT_1391 = "->";
  protected final String TEXT_1392 = "() <= ";
  protected final String TEXT_1393 = ")" + NL + "      {" + NL + "        $this->";
  protected final String TEXT_1394 = "->delete();" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        $this->";
  protected final String TEXT_1395 = "->";
  protected final String TEXT_1396 = "($this);" + NL + "      }" + NL + "    }";
  protected final String TEXT_1397 = NL + "    $this->";
  protected final String TEXT_1398 = "->";
  protected final String TEXT_1399 = "($this);";
  protected final String TEXT_1400 = NL + "    foreach ($this->";
  protected final String TEXT_1401 = " as $";
  protected final String TEXT_1402 = ")" + NL + "    {" + NL + "      $this->";
  protected final String TEXT_1403 = "($";
  protected final String TEXT_1404 = ",null);" + NL + "    }" + NL + "    $this->";
  protected final String TEXT_1405 = " = array();";
  protected final String TEXT_1406 = NL + "    $";
  protected final String TEXT_1407 = " = $this->";
  protected final String TEXT_1408 = ";" + NL + "    $this->";
  protected final String TEXT_1409 = " = array();" + NL + "    foreach ($";
  protected final String TEXT_1410 = " as $";
  protected final String TEXT_1411 = ")" + NL + "    {" + NL + "      if ($";
  protected final String TEXT_1412 = "->";
  protected final String TEXT_1413 = "() <= ";
  protected final String TEXT_1414 = "::";
  protected final String TEXT_1415 = "())" + NL + "      {" + NL + "        $";
  protected final String TEXT_1416 = "->delete();" + NL + "      }" + NL + "      else" + NL + "      {" + NL + "        $";
  protected final String TEXT_1417 = "->";
  protected final String TEXT_1418 = "($this);" + NL + "      }" + NL + "    }";
  protected final String TEXT_1419 = NL + "    $";
  protected final String TEXT_1420 = " = $this->";
  protected final String TEXT_1421 = ";" + NL + "    $this->";
  protected final String TEXT_1422 = " = array();" + NL + "    foreach ($";
  protected final String TEXT_1423 = " as $";
  protected final String TEXT_1424 = ")" + NL + "    {" + NL + "      $";
  protected final String TEXT_1425 = "->";
  protected final String TEXT_1426 = "($this);" + NL + "    }";
  protected final String TEXT_1427 = NL + "    foreach ($this->";
  protected final String TEXT_1428 = " as $";
  protected final String TEXT_1429 = ")" + NL + "    {" + NL + "      $";
  protected final String TEXT_1430 = "->delete();" + NL + "    }";
  protected final String TEXT_1431 = NL + "    foreach ($this->";
  protected final String TEXT_1432 = " as $";
  protected final String TEXT_1433 = ")" + NL + "    {" + NL + "      $";
  protected final String TEXT_1434 = "->";
  protected final String TEXT_1435 = "(null);" + NL + "    }";
  protected final String TEXT_1436 = NL + "  //------------------------" + NL + "  // DEVELOPER CODE - PROVIDED AS-IS" + NL + "  //------------------------" + NL + "  ";
  protected final String TEXT_1437 = NL + "  ";
  protected final String TEXT_1438 = NL + "}" + NL + "?>";

  // Add a newline to the end of the input
  private void appendln(StringBuffer buffer, String input, Object... variables)
  {
    append(buffer, input + "\n", variables);
  }  

  // This method will be used to append formatted strings
  // i.e. format("Hello {0} {1}", "andrew","forward");
  private void append(StringBuffer buffer, String input, Object... variables)
  {
    buffer.append(StringFormatter.format(input,variables));
  }

  /* 
  * This method will return the generated code.
  */
  public String getCode(UmpleModel model, UmpleElement uElement)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
  UmpleClass uClass = (UmpleClass) uElement;
  GeneratedClass gClass = uClass.getGeneratedClass();
  PhpGenerator gen = new PhpGenerator();
  gen.setModel(model);

  HashMap<String,String> codeInjectionMap = new HashMap<String,String>();
  for (CodeInjection inject : uClass.getCodeInjections())
  {
    String operation = StringFormatter.toUnderscore(inject.getOperation());
    String key = inject.getType() + ":" + operation;
    String newCodeToInject = "";
    if (codeInjectionMap.containsKey(key))
    {
      newCodeToInject = StringFormatter.format("{0}\n    {1}",codeInjectionMap.get(key),inject.getCode());
    }
    else
    {
      newCodeToInject = inject.getCode();
    }
    codeInjectionMap.put(key,newCodeToInject);
  }

  boolean isFirst = true;


    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
     if (uClass.numberOfComments() > 0) { if (!uClass.getComments().get(0).isInline) {append(stringBuffer, "\n{0}", Comment.format("Multiline",uClass.getComments()));} else {append(stringBuffer, "\n{0}", Comment.format("Slashes",uClass.getComments())); } } 
    stringBuffer.append(TEXT_3);
    stringBuffer.append( uClass.getName() );
    stringBuffer.append( gen.translate("isA",uClass) );
    stringBuffer.append(TEXT_4);
    
{
  isFirst = true;
  for(Attribute av : uClass.getAttributes())
  {
  
    if (!av.isConstant() && !av.getIsAutounique())
    {
      continue;
    }

    if (isFirst)
    {
      appendln(stringBuffer, "");
      appendln(stringBuffer, "");
      appendln(stringBuffer, "  //------------------------");
      appendln(stringBuffer, "  // STATIC VARIABLES");
      appendln(stringBuffer, "  //------------------------");
      isFirst = false;
    }
  
    if (av.isConstant())
    {
      appendln(stringBuffer, "");
      append(stringBuffer, "  public static ${0} = {1};", av.getName(), gen.translate("parameterValue",av));
    }
    else if (av.getIsAutounique())
    {
      String defaultValue = av.getValue() == null ? "1" : av.getValue();
      appendln(stringBuffer, "");
      append(stringBuffer, "  private static $next{0} = {1};", av.getUpperCaseName(), defaultValue);
    }
  }
  
  if (uClass.getIsSingleton())
  {
    if (isFirst)
    {
      appendln(stringBuffer, "");
      appendln(stringBuffer, "");
      appendln(stringBuffer, "  //------------------------");
      appendln(stringBuffer, "  // STATIC VARIABLES");
      appendln(stringBuffer, "  //------------------------");
      isFirst = false;
    }
    appendln(stringBuffer, "");
    append(stringBuffer, "  private static $theInstance = null;");
  }
}

    
{

  appendln(stringBuffer, "");
  appendln(stringBuffer, "");
  appendln(stringBuffer, "  //------------------------");
  appendln(stringBuffer, "  // MEMBER VARIABLES");
  append(stringBuffer, "  //------------------------");

  isFirst = true;
  for(Attribute av : uClass.getAttributes())
  {
    if (av.isConstant() || av.getIsAutounique() || av.getIsDerived())
    {
      continue;
    }
    if (isFirst)
    {
      appendln(stringBuffer, "");
      appendln(stringBuffer, "");
      append(stringBuffer,"  //{0} Attributes", uClass.getName());
      isFirst = false;
    }
    
    String attribute = gen.translate("attributeOne",av);
    if (av.getIsList())
    {
      attribute = gen.translate("attributeMany",av);
    }

    appendln(stringBuffer, "");
    append(stringBuffer, "  private ${0};", attribute);
  }
  
  isFirst = true;
  for(Attribute av : uClass.getAttributes())
  {
    if (!av.getIsAutounique())
    {
      continue;
    }
    if (isFirst)
    {
      appendln(stringBuffer, "");
      appendln(stringBuffer, "");
      append(stringBuffer,"  //Autounique Attributes");
      isFirst = false;
    }
    appendln(stringBuffer, "");
    String lookup = av.getIsList() ? "attributeMany" : "attributeOne";
    append(stringBuffer, "  private ${0};", gen.translate(lookup,av));
  }
}

    
{
  isFirst = true;
  for(StateMachine sm : uClass.getStateMachines())
  {
    List<StateMachine> allNested = sm.getNestedStateMachines();

    if (isFirst)
    {
      appendln(stringBuffer, "");
      appendln(stringBuffer, "");
      append(stringBuffer,"  //{0} State Machines", uClass.getName());
      isFirst = false;
    }
    else
    {
      appendln(stringBuffer,"");
    }
  
    int stateCounter = 0;
    for(State state : sm.getStates())
    {
      if (stateCounter >= 0)
      {
        appendln(stringBuffer,"");
      }
      stateCounter += 1;
      append(stringBuffer, "  private static ${0} = {1};", gen.translate("stateOne",state), stateCounter);
    }

    for (StateMachine nestedSm : allNested)
    {
      for(State state : nestedSm.getStates())
      {
        if (stateCounter >= 0)
        {
          appendln(stringBuffer,"");
        }
        stateCounter += 1;
        append(stringBuffer, "  private static ${0} = {1};", gen.translate("stateOne",state), stateCounter);
      }
    }
    
    append(stringBuffer, "\n  private ${0};", gen.translate("stateMachineOne", sm));
    for (StateMachine nestedSm : allNested)
    {
      append(stringBuffer, "\n  private ${0};", gen.translate("stateMachineOne", nestedSm));
    }

  }
}

    
{
  isFirst = true;
  for (AssociationVariable av : uClass.getAssociationVariables())
  {
    if (!av.getIsNavigable())
    {
      continue;
    }
    
    if (isFirst)
    {
      appendln(stringBuffer, "");
      appendln(stringBuffer, "");
      append(stringBuffer,"  //{0} Associations", uClass.getName());
      isFirst = false;
    }
  
    appendln(stringBuffer, "");
    String lookup = av.isOne() ? "associationOne" : "associationMany";
    
    if (av.isOptionalOne() && av.getRelatedAssociation().isMandatory())
    {
      append(stringBuffer, "  public ${0}; //until PHP 5.3 (setAccessible)", gen.translate(lookup,av));
    }
    else
    {
      append(stringBuffer, "  private ${0};", gen.translate(lookup,av));
    }
  }
}

    
{

  isFirst = true;
  if (uClass.getKey().isProvided())
  {
    isFirst = false;
    appendln(stringBuffer, "");
    appendln(stringBuffer, "");
    appendln(stringBuffer,"  //Helper Variables");
    append(stringBuffer, "  private $cachedHashCode;");
  }

  for (Attribute av : uClass.getAttributes())
  {
    if ("immutable".equals(av.getModifier()))
    {
      if (isFirst)
      {
        isFirst = false;
        appendln(stringBuffer, "");
        appendln(stringBuffer, "");
        appendln(stringBuffer,"  //Helper Variables");
      }
      else
      {
        appendln(stringBuffer, "");
      }
      append(stringBuffer, "  private ${0};", gen.translate("attributeCanSet",av));
    }
  }
  
  for(String memberId : uClass.getKey().getMembers())
  {
    Attribute av = uClass.getAttribute(memberId);
    AssociationVariable as = uClass.getAssociationVariable(memberId);
    if (av != null && !"immutable".equals(av.getModifier()))
    {
      appendln(stringBuffer, "");
      append(stringBuffer, "  private ${0};", gen.translate("attributeCanSet",av));
    }
    else if (as != null)
    {
      appendln(stringBuffer, "");
      append(stringBuffer, "  private ${0};", gen.translate("associationCanSet",as));
    }
  }
}

    stringBuffer.append(TEXT_5);
    
  boolean isOneToOne = false;
  String instanceIdentifier = "this";
  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {
    AssociationVariable relatedAssocation = av.getRelatedAssociation();
    if (av.isOnlyOne() && relatedAssocation.isOnlyOne() && av.getIsNavigable() && relatedAssocation.getIsNavigable())
    {
      isOneToOne = true;
      break;
    }
  }
  
    

  String customConstructorPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before","constructor"));
  String customConstructorPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after","constructor"));

  appendln(stringBuffer, "");

  String constructorLookup = isOneToOne ? "constructorSignature_nulled" : "constructorSignature";
  String accessibility = uClass.getIsSingleton() ? "private" : "public";
  append(stringBuffer,"  {0} function __construct({1})",accessibility, gClass.getLookup(constructorLookup));

  appendln(stringBuffer, "");
  
  boolean hasBody = false;
  
  append(stringBuffer, "  {");
  
  if (isOneToOne)
  {
    appendln(stringBuffer,"");
    appendln(stringBuffer,"    if (func_num_args() == 0) { return; }");
  }
  
  if (!uClass.isRoot() && !"interface".equals(uClass.getExtendsClass().getModifier()))
  {
    appendln(stringBuffer, "");
    append(stringBuffer, "    parent::__construct({0});", gClass.getParentClass().getLookup("constructorSignature_caller"));
    hasBody = true;
  }

  if (customConstructorPrefixCode != null)
  {
    append(stringBuffer, "\n    {0}",customConstructorPrefixCode);
    hasBody = true;
  }
  
  for (Attribute av : uClass.getAttributes())
  {
    if (av.getIsAutounique() || av.isConstant() || "theInstance".equals(gen.translate("attributeOne",av)) || av.getIsDerived())
    {
      continue;
    }
    
    if (av.getIsList())
    {
      hasBody = true;
      
    stringBuffer.append(TEXT_6);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_8);
    
    }
    else if ("defaulted".equals(av.getModifier()))
    {
      hasBody = true;
      
    stringBuffer.append(TEXT_9);
    stringBuffer.append(gen.translate("resetMethod",av));
    stringBuffer.append(TEXT_10);
     
    }
    else if ("immutable".equals(av.getModifier()) && av.getIsLazy())
    {
      hasBody = true;
      
    stringBuffer.append(TEXT_11);
    stringBuffer.append(gen.translate("attributeCanSet",av));
    stringBuffer.append(TEXT_12);
    
    }
    else if ("immutable".equals(av.getModifier()))
    {
      hasBody = true;
      
    
  String parameterValue = "";
  if (av.getValue() == null)
  {
    parameterValue = "$" + gen.translate("parameterOne",av);
  }
  else
  {
    parameterValue = gen.translate("parameterValue",av);
  }

    stringBuffer.append(TEXT_13);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(parameterValue);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(gen.translate("attributeCanSet",av));
    stringBuffer.append(TEXT_16);
     
    }
    else
    {
      hasBody = true;
      if(!av.getIsLazy()){
         
    
  String assignValue = av.getValue() == null ? "$" + gen.translate("parameterOne",av) : gen.translate("parameterValue",av);

    stringBuffer.append(TEXT_17);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_18);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(assignValue);
    stringBuffer.append(TEXT_20);
    
      }
      else
      {
         
    
  String parameterLookup = null; // av.getValue() == null ? "parameterOne" : "parameterValue";
  String defaultValue = null;
  
 
  if(av.getValue() == null)
  {
     // Try to assign a null value or 0 value if we recognize
     // one of Umple's built in data types. (http://cruise.site.uottawa.ca/umple/UmpleBuiltinDataTypes.html)

     if(av.getType().equals("String") || av.getType().equals("Date") || av.getType().equals("Time"))
     {
  	   defaultValue = "NULL";
     }
     else if(av.getType().equals("Double") || av.getType().equals("Float") || av.getType().equals("Integer"))
     {
  	   defaultValue = "0";
     }
     else if(av.getType().equals("Boolean"))
     {
  	   defaultValue = "false";
     }
   }
   else
   {
       defaultValue = gen.translate("parameterValue",av);
   }
  
  // Only assign a value if we could find a default
  if(defaultValue != null)
  { 
    stringBuffer.append(TEXT_21);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(defaultValue);
    stringBuffer.append(TEXT_24);
    } 
    
      }
    }
  }

  for (Attribute av : uClass.getAttributes())
  {
    if (av.getIsAutounique())
    {
      hasBody = true;
      
    stringBuffer.append(TEXT_25);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_26);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(gen.translate("parameterNext",av));
    stringBuffer.append(TEXT_28);
    
    }
  }
  
  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {
    AssociationVariable relatedAssociation = av.getRelatedAssociation();
    
    if (!av.getIsNavigable())
    {
      continue;
    }
    
    if (!relatedAssociation.getIsNavigable())
    {
      if (av.isOnlyOne())
      {
        hasBody = true;
        
    stringBuffer.append(TEXT_29);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_34);
    
      }
      else if (av.isMandatoryMany())
      {
        hasBody = true;
        
    
  String requiredNumber = "";
  if (av.isN())
  {
    requiredNumber += av.getMultiplicity().getLowerBound();
  }
  else if (av.isStar())
  {
    requiredNumber = StringFormatter.format("at least {0}", av.getMultiplicity().getLowerBound());
  }
  else
  {
    requiredNumber = StringFormatter.format("{0} to {1}", av.getMultiplicity().getLowerBound(), av.getMultiplicity().getUpperBound());
  }
  

    stringBuffer.append(TEXT_35);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(gen.translate("didAddMany",av));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(gen.translate("parameterAll",av));
    stringBuffer.append(TEXT_41);
    stringBuffer.append(gen.translate("didAddMany",av));
    stringBuffer.append(TEXT_42);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_43);
    stringBuffer.append(requiredNumber);
    stringBuffer.append(TEXT_44);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_45);
    
      }
      else if (av.isMany())
      {
        hasBody = true;
        
    stringBuffer.append(TEXT_46);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_47);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_48);
    
      }
      continue;
    }
    
    if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
    {
      hasBody = true;
      
    stringBuffer.append(TEXT_49);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_50);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_52);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_53);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_55);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_56);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_57);
    
    }
    else if ((av.isMN() || av.isN()) && (relatedAssociation.isMandatory() || relatedAssociation.isOptionalN()))
    {
      hasBody = true;
      
    stringBuffer.append(TEXT_58);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_59);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_60);
    
    }
    else if (av.isOnlyOne())
    {
      hasBody = true;
      
    stringBuffer.append(TEXT_61);
    stringBuffer.append(gen.translate("didAdd",av));
    stringBuffer.append(TEXT_62);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_63);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_64);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_65);
    stringBuffer.append(gen.translate("didAdd",av));
    stringBuffer.append(TEXT_66);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_67);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_68);
    
    }
    else
    {
      
    
  if (!av.getIsNavigable())
  {
    continue;
  }

  if (av.isOptionalMany())
  {
    appendln(stringBuffer,"");
    append(stringBuffer, "    $this->{0} = array();", gen.translate("associationMany",av));
  }
  else if (av.isMandatoryMany())
  {
    
    
  String requiredNumber = "";
  if (av.isN())
  {
    requiredNumber += av.getMultiplicity().getLowerBound();
  }
  else if (av.isStar())
  {
    requiredNumber = StringFormatter.format("at least {0}", av.getMultiplicity().getLowerBound());
  }
  else
  {
    requiredNumber = StringFormatter.format("{0} to {1}", av.getMultiplicity().getLowerBound(), av.getMultiplicity().getUpperBound());
  }
  

    stringBuffer.append(TEXT_69);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_70);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_71);
    stringBuffer.append(gen.translate("didAddMany",av));
    stringBuffer.append(TEXT_72);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_73);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_74);
    stringBuffer.append(gen.translate("parameterAll",av));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(gen.translate("didAddMany",av));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_77);
    stringBuffer.append(requiredNumber);
    stringBuffer.append(TEXT_78);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_79);
    
  }
  else if (av.getMultiplicity().getLowerBound() > 0)
  {
    
    stringBuffer.append(TEXT_80);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_82);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_83);
    
  } 
  else
  {
    continue;
  }
  hasBody = true;

    
    }
  }
  
  for(StateMachine sm : uClass.getStateMachines())
  {
    State state = sm.getStartState();
    if (state == null)
    {
      continue;
    }
    hasBody = true;
    for (StateMachine nestedSm : sm.getNestedStateMachines())
    {
      
    stringBuffer.append(TEXT_84);
    stringBuffer.append(gen.translate("setMethod",nestedSm));
    stringBuffer.append(TEXT_85);
    stringBuffer.append(gen.translate("stateNull",nestedSm));
    stringBuffer.append(TEXT_86);
    
    }
    
    stringBuffer.append(TEXT_87);
    stringBuffer.append(gen.translate("setMethod",sm));
    stringBuffer.append(TEXT_88);
    stringBuffer.append(gen.translate("stateOne",state));
    stringBuffer.append(TEXT_89);
    
  }  
  
  if (uClass.getKey().isProvided())
  {
    hasBody = true;
    appendln(stringBuffer, "");
    append(stringBuffer, "    $this->cachedHashCode = -1;");
  }
  
  for(String memberId : uClass.getKey().getMembers())
  {
    Attribute av = uClass.getAttribute(memberId);
    AssociationVariable as = uClass.getAssociationVariable(memberId);
    if (av != null && !"immutable".equals(av.getModifier()))
    {
      hasBody = true;
      appendln(stringBuffer, "");
      append(stringBuffer, "    $this->{0} = true;", gen.translate("attributeCanSet",av));
    }
    else if (as != null)
    {
      hasBody = true;
      appendln(stringBuffer, "");
      append(stringBuffer, "    $this->{0} = true;", gen.translate("associationCanSet",as));
    }
  }
  
  if (customConstructorPostfixCode != null)
  {
    append(stringBuffer, "\n    {0}",customConstructorPostfixCode);
    hasBody = true;
  }

  if (hasBody)
  {
    appendln(stringBuffer, "");
    append(stringBuffer, "  }");
  }
  else
  {
    append(stringBuffer, "}");
  }

  if (uClass.getIsSingleton())
  {
    appendln(stringBuffer, "");
    
    stringBuffer.append(TEXT_90);
    stringBuffer.append(uClass.getName());
    stringBuffer.append(TEXT_91);
    
  }

    
  if (isOneToOne)
  {
    instanceIdentifier = "thisInstance";
    
    
  String signature = gClass.getLookup("constructorSignature_mandatory");

    stringBuffer.append(TEXT_92);
    stringBuffer.append(gen.translate("constructorMandatory",uClass));
    stringBuffer.append(TEXT_93);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_94);
    stringBuffer.append(uClass.getName());
    stringBuffer.append(TEXT_95);
    
  if (!uClass.isRoot())
  {
    appendln(stringBuffer, "");
    append(stringBuffer, "    ${0}->__construct({1});", instanceIdentifier , gClass.getParentClass().getLookup("constructorSignature_caller"));
  }
  
  for (Attribute av : uClass.getAttributes())
  {
    if (av.getIsAutounique() || av.isConstant() || "theInstance".equals(gen.translate("attributeOne",av)))
    {
      continue;
    }
  
    if (av.getIsList())
    {
      
    stringBuffer.append(TEXT_96);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_97);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_98);
    
    }
    else if (av.getModifier().equals("defaulted"))
    {
      
    stringBuffer.append(TEXT_99);
    stringBuffer.append(gen.translate("resetMethod",av));
    stringBuffer.append(TEXT_100);
     
    }
    else
    {
      
    
  String assignValue = av.getValue() == null ? "$" + gen.translate("parameterOne",av) : gen.translate("parameterValue",av);

    stringBuffer.append(TEXT_101);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_102);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_103);
    stringBuffer.append(assignValue);
    stringBuffer.append(TEXT_104);
    
    }
  }

  for (Attribute av : uClass.getAttributes())
  {
    if (av.getIsAutounique())
    {
      hasBody = true;
      
    stringBuffer.append(TEXT_105);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_106);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_107);
    stringBuffer.append(gen.translate("parameterNext",av));
    stringBuffer.append(TEXT_108);
    
    }
  }
  
  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {
    AssociationVariable relatedAssociation = av.getRelatedAssociation();
    
    if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
    {
      hasBody = true;
      
    stringBuffer.append(TEXT_109);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_110);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_111);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_112);
    stringBuffer.append(gen.translate("callerArgumentsForMandatory",relatedAssociation));
    stringBuffer.append(TEXT_113);
    
    }
    else
    {
      hasBody = true;
      
    
  if (!av.getIsNavigable())
  {
    continue;
  }

  if (av.isOptionalMany())
  {
    appendln(stringBuffer,"");
    append(stringBuffer, "    $this->{0} = array();", gen.translate("associationMany",av));
  }
  else if (av.isMandatoryMany())
  {
    
    
  String requiredNumber = "";
  if (av.isN())
  {
    requiredNumber += av.getMultiplicity().getLowerBound();
  }
  else if (av.isStar())
  {
    requiredNumber = StringFormatter.format("at least {0}", av.getMultiplicity().getLowerBound());
  }
  else
  {
    requiredNumber = StringFormatter.format("{0} to {1}", av.getMultiplicity().getLowerBound(), av.getMultiplicity().getUpperBound());
  }
  

    stringBuffer.append(TEXT_114);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_115);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_116);
    stringBuffer.append(gen.translate("didAddMany",av));
    stringBuffer.append(TEXT_117);
    stringBuffer.append(instanceIdentifier);
    stringBuffer.append(TEXT_118);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_119);
    stringBuffer.append(gen.translate("parameterAll",av));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(gen.translate("didAddMany",av));
    stringBuffer.append(TEXT_121);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_122);
    stringBuffer.append(requiredNumber);
    stringBuffer.append(TEXT_123);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_124);
    
  }
  else if (av.getMultiplicity().getLowerBound() > 0)
  {
    
    stringBuffer.append(TEXT_125);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_126);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_127);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_128);
    
  } 
  else
  {
    continue;
  }
  hasBody = true;

    
    }
  }
  
  appendln(stringBuffer, "");
  appendln(stringBuffer, "    return ${0};",instanceIdentifier);
  append(stringBuffer, "  }");
  
  if (!uClass.isRoot())
  {
    
    stringBuffer.append(TEXT_129);
    stringBuffer.append( gClass.getParentClass().getLookup("constructorSignature") );
    stringBuffer.append(TEXT_130);
    stringBuffer.append( gClass.getParentClass().getLookup("constructorSignature_caller") );
    stringBuffer.append(TEXT_131);
    
  }

    
  }


    stringBuffer.append(TEXT_132);
    
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -Dmyenv=FILL_ME_IN.xml codegenMoveTemplates to move into the appropriate projects
  for (Attribute av : uClass.getAttributes())
  {
  
    if (av.isConstant() || av.getIsAutounique() || "internal".equals(av.getModifier()) || av.getIsDerived())
    {
      continue;
    }

    String customSetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("setMethod",av)));
    String customSetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("setMethod",av)));

    String customResetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("resetMethod",av)));
    String customResetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("resetMethod",av)));

    String customAddPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("addMethod",av)));
    String customAddPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("addMethod",av)));
  
    String customRemovePrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("removeMethod",av)));
    String customRemovePostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("removeMethod",av)));
    
    if ("immutable".equals(av.getModifier()))
    {
      if (av.getIsLazy())
      {
        
    stringBuffer.append(TEXT_133);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_134);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_135);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetPrefixCode); } 
    stringBuffer.append(TEXT_136);
    stringBuffer.append( gen.translate("attributeCanSet",av) );
    stringBuffer.append(TEXT_137);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_138);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_139);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_140);
    
      }
    }
    else if (av.getModifier().equals("defaulted"))
    {
      
    stringBuffer.append(TEXT_141);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_142);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_143);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetPrefixCode); } 
    stringBuffer.append(TEXT_144);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_145);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_146);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_147);
    stringBuffer.append(gen.translate("resetMethod",av));
    stringBuffer.append(TEXT_148);
     if (customResetPrefixCode != null) { append(stringBuffer, "\n    {0}",customResetPrefixCode); } 
    stringBuffer.append(TEXT_149);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_150);
    stringBuffer.append(gen.translate("getDefaultMethod",av));
    stringBuffer.append(TEXT_151);
     if (customResetPostfixCode != null) { append(stringBuffer, "\n    {0}",customResetPostfixCode); } 
    stringBuffer.append(TEXT_152);
    
    }
    else if (av.getIsList())
    {
      
    stringBuffer.append(TEXT_153);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_154);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_155);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n    {0}",customAddPrefixCode); } 
    stringBuffer.append(TEXT_156);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_157);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_158);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n    {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_159);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_160);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_161);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n    {0}",customRemovePrefixCode); } 
    stringBuffer.append(TEXT_162);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_163);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_164);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_165);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_166);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_167);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n    {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_168);
    
    }
    else
    {
      
    stringBuffer.append(TEXT_169);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_170);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_171);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetPrefixCode); } 
    stringBuffer.append(TEXT_172);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_173);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_174);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_175);
    
    }
  }

    
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -Dmyenv=FILL_ME_IN.xml codegenMoveTemplates to move into the appropriate projects
  for (Attribute av : uClass.getAttributes()) 
  {
    if (av.getIsAutounique() || av.isConstant() || "internal".equals(av.getModifier()))
    {
      continue;
    }
    
    String customGetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getMethod",av)));
    String customGetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getMethod",av)));

    String customGetDefaultPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getDefaultMethod",av)));
    String customGetDefaultPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getDefaultMethod",av)));

    String customGetManyPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getManyMethod",av)));
    String customGetManyPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getManyMethod",av)));

    String customNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("numberOfMethod",av)));
    String customNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("numberOfMethod",av)));

    String customHasManyPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("hasManyMethod",av)));
    String customHasManyPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("hasManyMethod",av)));

    String customIndexOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("indexOfMethod",av)));
    String customIndexOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("indexOfMethod",av)));
    
    if (av.getIsList())
    {
      
    stringBuffer.append(TEXT_176);
    stringBuffer.append(gen.translate("getMethod",av));
    stringBuffer.append(TEXT_177);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n    {0}",customGetPrefixCode); } 
    stringBuffer.append(TEXT_178);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_179);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_180);
     if (customGetPostfixCode != null) { append(stringBuffer, "\n    {0}",customGetPostfixCode); } 
    stringBuffer.append(TEXT_181);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_182);
    stringBuffer.append(gen.translate("getManyMethod",av));
    stringBuffer.append(TEXT_183);
     if (customGetManyPrefixCode != null) { append(stringBuffer, "\n    {0}",customGetManyPrefixCode); } 
    stringBuffer.append(TEXT_184);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_185);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_186);
     if (customGetManyPostfixCode != null) { append(stringBuffer, "\n    {0}",customGetManyPostfixCode); } 
    stringBuffer.append(TEXT_187);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_188);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_189);
     if (customNumberOfPrefixCode != null) { append(stringBuffer, "\n    {0}",customNumberOfPrefixCode); } 
    stringBuffer.append(TEXT_190);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_191);
     if (customNumberOfPostfixCode != null) { append(stringBuffer, "\n    {0}",customNumberOfPostfixCode); } 
    stringBuffer.append(TEXT_192);
    stringBuffer.append(gen.translate("hasManyMethod",av));
    stringBuffer.append(TEXT_193);
     if (customHasManyPrefixCode != null) { append(stringBuffer, "\n    {0}",customHasManyPrefixCode); } 
    stringBuffer.append(TEXT_194);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_195);
     if (customHasManyPostfixCode != null) { append(stringBuffer, "\n    {0}",customHasManyPostfixCode); } 
    stringBuffer.append(TEXT_196);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_197);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_198);
     if (customIndexOfPrefixCode != null) { append(stringBuffer, "\n    {0}",customIndexOfPrefixCode); } 
    stringBuffer.append(TEXT_199);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_200);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_201);
     if (customIndexOfPostfixCode != null) { append(stringBuffer, "\n    {0}",customIndexOfPostfixCode); } 
    stringBuffer.append(TEXT_202);
    
    }
    else 
    {

      if (av.getIsDerived() && customGetPostfixCode != null)
      {
        
    stringBuffer.append(TEXT_203);
    stringBuffer.append(gen.translate("getMethod",av));
    stringBuffer.append(TEXT_204);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n    {0}",customGetPrefixCode); } 
    stringBuffer.append(TEXT_205);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_206);
    stringBuffer.append( gen.translate("parameterValue",av) );
    stringBuffer.append(TEXT_207);
     if (customGetPostfixCode != null) { append(stringBuffer, "\n    {0}",customGetPostfixCode); } 
    stringBuffer.append(TEXT_208);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_209);
    
      }
      else if (av.getIsDerived())
      {
        
    stringBuffer.append(TEXT_210);
    stringBuffer.append(gen.translate("getMethod",av));
    stringBuffer.append(TEXT_211);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n    {0}",customGetPrefixCode); } 
    stringBuffer.append(TEXT_212);
    stringBuffer.append( gen.translate("parameterValue",av) );
    stringBuffer.append(TEXT_213);
    
      }
      else if (customGetPostfixCode != null)
      {
        
    stringBuffer.append(TEXT_214);
    stringBuffer.append(gen.translate("getMethod",av));
    stringBuffer.append(TEXT_215);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n    {0}",customGetPrefixCode); } 
    stringBuffer.append(TEXT_216);
    stringBuffer.append( gen.translate("parameterOne",av) );
    stringBuffer.append(TEXT_217);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_218);
     if (customGetPostfixCode != null) { append(stringBuffer, "\n    {0}",customGetPostfixCode); } 
    stringBuffer.append(TEXT_219);
    stringBuffer.append( gen.translate("parameterOne",av) );
    stringBuffer.append(TEXT_220);
    
      }
      else
      {
        
    stringBuffer.append(TEXT_221);
    stringBuffer.append(gen.translate("getMethod",av));
    stringBuffer.append(TEXT_222);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n    {0}",customGetPrefixCode); } 
    stringBuffer.append(TEXT_223);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_224);
    
      }
      
      appendln(stringBuffer, "");
      
      if (av.getModifier().equals("defaulted") && customGetDefaultPostfixCode != null)
      {
        
    stringBuffer.append(TEXT_225);
    stringBuffer.append(gen.translate("getDefaultMethod",av));
    stringBuffer.append(TEXT_226);
     if (customGetDefaultPrefixCode != null) { append(stringBuffer, "\n    {0}",customGetDefaultPrefixCode); } 
    stringBuffer.append(TEXT_227);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_228);
    stringBuffer.append( gen.translate("parameterValue",av) );
    stringBuffer.append(TEXT_229);
     if (customGetDefaultPostfixCode != null) { append(stringBuffer, "\n    {0}",customGetDefaultPostfixCode); } 
    stringBuffer.append(TEXT_230);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_231);
    
      }
      else if (av.getModifier().equals("defaulted"))
      {
        
    stringBuffer.append(TEXT_232);
    stringBuffer.append(gen.translate("getDefaultMethod",av));
    stringBuffer.append(TEXT_233);
     if (customGetDefaultPrefixCode != null) { append(stringBuffer, "\n    {0}",customGetDefaultPrefixCode); } 
    stringBuffer.append(TEXT_234);
    stringBuffer.append( gen.translate("parameterValue",av) );
    stringBuffer.append(TEXT_235);
    
      }
    }
  }

  for (Attribute av : uClass.getAttributes()) 
  {
  
    if (av.getIsAutounique())
    {
      String customGetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getMethod",av)));
      String customGetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getMethod",av)));
      
      if (customGetPostfixCode != null)
      {
        
    stringBuffer.append(TEXT_236);
    stringBuffer.append(gen.translate("getMethod",av));
    stringBuffer.append(TEXT_237);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n    {0}",customGetPrefixCode); } 
    stringBuffer.append(TEXT_238);
    stringBuffer.append( gen.translate("parameterOne",av) );
    stringBuffer.append(TEXT_239);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_240);
     if (customGetPostfixCode != null) { append(stringBuffer, "\n    {0}",customGetPostfixCode); } 
    stringBuffer.append(TEXT_241);
    stringBuffer.append( gen.translate("parameterOne",av) );
    stringBuffer.append(TEXT_242);
    
      }
      else
      {
        
    stringBuffer.append(TEXT_243);
    stringBuffer.append(gen.translate("getMethod",av));
    stringBuffer.append(TEXT_244);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n    {0}",customGetPrefixCode); } 
    stringBuffer.append(TEXT_245);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_246);
    
      }
      appendln(stringBuffer, "");
    }
  }

    
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -Dmyenv=FILL_ME_IN.xml codegenMoveTemplates to move into the appropriate projects
  for (Attribute av : uClass.getAttributes()) 
  {
    if (!av.getType().equals("Boolean") || av.getIsAutounique() || av.isConstant() || "internal".equals(av.getModifier()))
    {
      continue;
    }

    String customGetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("isMethod",av)));
    String customGetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("isMethod",av)));
    
    if (av.getIsDerived() && customGetPostfixCode != null)
    {
      
    stringBuffer.append(TEXT_247);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_248);
    stringBuffer.append( gen.translate("isMethod",av) );
    stringBuffer.append(TEXT_249);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n    {0}",customGetPrefixCode); } 
    stringBuffer.append(TEXT_250);
    stringBuffer.append( gen.translate("type",av) );
    stringBuffer.append(TEXT_251);
    stringBuffer.append( gen.translate("parameterOne",av) );
    stringBuffer.append(TEXT_252);
    stringBuffer.append( gen.translate("parameterValue",av) );
    stringBuffer.append(TEXT_253);
     if (customGetPostfixCode != null) { append(stringBuffer, "\n    {0}",customGetPostfixCode); } 
    stringBuffer.append(TEXT_254);
    stringBuffer.append( gen.translate("parameterOne",av) );
    stringBuffer.append(TEXT_255);
    
    }
    else if (av.getIsDerived())
    {
      
    stringBuffer.append(TEXT_256);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_257);
    stringBuffer.append( gen.translate("isMethod",av) );
    stringBuffer.append(TEXT_258);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n    {0}",customGetPrefixCode); } 
    stringBuffer.append(TEXT_259);
    stringBuffer.append(gen.translate("parameterValue",av));
    stringBuffer.append(TEXT_260);
    
    }
    else if (customGetPostfixCode != null)
    {
      
    stringBuffer.append(TEXT_261);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_262);
    stringBuffer.append( gen.translate("isMethod",av) );
    stringBuffer.append(TEXT_263);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n    {0}",customGetPrefixCode); } 
    stringBuffer.append(TEXT_264);
    stringBuffer.append( gen.translate("parameterOne",av) );
    stringBuffer.append(TEXT_265);
    stringBuffer.append( gen.translate("parameterValue",av) );
    stringBuffer.append(TEXT_266);
     if (customGetPostfixCode != null) { append(stringBuffer, "\n    {0}",customGetPostfixCode); } 
    stringBuffer.append(TEXT_267);
    stringBuffer.append( gen.translate("parameterOne",av) );
    stringBuffer.append(TEXT_268);
    
    }
    else
    {
      
    stringBuffer.append(TEXT_269);
    stringBuffer.append(gen.translate("isMethod",av) );
    stringBuffer.append(TEXT_270);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n    {0}",customGetPrefixCode); } 
    stringBuffer.append(TEXT_271);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_272);
    
    }
      
    appendln(stringBuffer, "");
  }


    
{
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -Dmyenv=FILL_ME_IN.xml codegenMoveTemplates to move into the appropriate projects
  isFirst = true;
  for(StateMachine sm : uClass.getStateMachines())
  {
    
    
  StringBuilder output = new StringBuilder(); 
  List<StateMachine> allParents = new ArrayList<StateMachine>();
  allParents.add(sm);
  while (allParents.size() > 0) 
  {
    StateMachine parentSm = allParents.get(0);
    allParents.remove(0);
    for (StateMachine childSm : parentSm.getNestedStateMachines()) 
    {
      output.append(StringFormatter.format("\n    if ($this->{0} != self::${2}) { $answer .= \".\" . $this->{1}(); }",gen.translate("stateMachineOne",childSm),gen.translate("getMethod",childSm),gen.translate("stateNull",childSm)));
      allParents.addAll(childSm.getNestedStateMachines());
    }     
  }
  String outputAsString = output.toString();

    stringBuffer.append(TEXT_273);
    stringBuffer.append(gen.translate("getFullMethod",sm));
    stringBuffer.append(TEXT_274);
    stringBuffer.append(gen.translate("getMethod",sm));
    stringBuffer.append(TEXT_275);
     if (outputAsString.length() > 0) { append(stringBuffer, "{0}",outputAsString); } 
    stringBuffer.append(TEXT_276);
     
  }
  
  for(StateMachine sm : uClass.getAllStateMachines())
  {
    
    
  StringBuffer allCases = new StringBuffer();
{
  isFirst = true;
  for(State state : sm.getStates())
  {
    if (isFirst)
    {
      allCases.append(StringFormatter.format("if ($this->{0} == self::${1}) { return {2}; }\n",gen.translate("stateMachineOne",sm), gen.translate("stateOne",state), gen.translate("stateString",state)));
    }
    else
    {
      allCases.append(StringFormatter.format("    elseif ($this->{0} == self::${1}) { return {2}; }\n",gen.translate("stateMachineOne",sm), gen.translate("stateOne",state), gen.translate("stateString",state)));
    }
    isFirst = false;
  }
}
  String outputCases = allCases.toString().trim();

    stringBuffer.append(TEXT_277);
    stringBuffer.append(gen.translate("getMethod",sm));
    stringBuffer.append(TEXT_278);
     if (outputCases.length() > 0) { append(stringBuffer, "\n    {0}",outputCases); } 
    stringBuffer.append(TEXT_279);
     
  }
}

    
{
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -Dmyenv=FILL_ME_IN.xml codegenMoveTemplates to move into the appropriate projects
  for(Event e : uClass.getEvents())
  {
    
    
  StringBuffer allCases = new StringBuffer();
  StringBuffer allDeclarations = new StringBuffer();

  boolean firstStateMachine = true;
  for(StateMachine sm : uClass.getStateMachines(e))
  {
    for( TraceDirective tc : uClass.getTraceDirectives() )
  	{
  		for( int i = 0 ; i < tc.numberOfStateMachineTraceItems() ; ++ i )
  		{
  			if( tc.getStateMachineTraceItem(i).getStateMachine() == sm )
  			{
  				if( model.getTraceType().equals("Console"))
  				{
  					allCases.append(StringFormatter.format("\n    print(\"Event={0}\");\n    ",gen.translate("eventMethod",e)));
  				}
  				else if( model.getTraceType().equals("File"))
  				{
  					allCases.append(StringFormatter.format("\n    fileTracer(\"Event={0}\");\n    ",gen.translate("eventMethod",e)));
  				}
  			}
  		}
  	}
  	allDeclarations.append(StringFormatter.format("\n    ${0} = $this->{1};",gen.translate("parameterOne",sm),gen.translate("stateMachineOne", sm)));
  	
    boolean first = true;
    if (!firstStateMachine)
    {
      allCases.append("\n\n    ");
    }

    for(State state : sm.getStates())
    {
  
      List<Transition> allT = state.getTransitionsFor(e);
      
      if (allT.size() == 0)
      {
        continue;
      }
      
      if (first)
      {
        allCases.append(StringFormatter.format("\n    if (${0} == self::${1})\n",gen.translate("parameterOne",sm),gen.translate("stateOne",state)));
      }
      else
      {
        allCases.append(StringFormatter.format("\n    elseif (${0} == self::${1})\n",gen.translate("parameterOne",sm),gen.translate("stateOne",state)));
      }
      allCases.append(StringFormatter.format("    {\n"));
  
      boolean needsBreak = true;
      for (Transition t : allT)
      {
        State nextState = t.getNextState();
        String spaceOffset = t.getGuard() == null ? "" : "  ";
        if (t.getGuard() != null)
        {
          allCases.append(StringFormatter.format("      if ({0})\n",t.getGuard().getCondition()));
          allCases.append(StringFormatter.format("      {\n"));
        }
        if (state.getHasExitAction())
        {
          allCases.append(StringFormatter.format("{0}      $this->{1}();\n",spaceOffset,gen.translate("exitMethod",sm)));
        }
        if (t.getAction() != null)
        {
          Action a1= t.getAction();
          allCases.append(StringFormatter.format("{0}      {1}\n",spaceOffset,a1.getActionCode()));
        }
  
        allCases.append(StringFormatter.format("{0}      $this->{1}(self::${2});\n",spaceOffset,gen.translate("setMethod",nextState.getStateMachine()),gen.translate("stateOne",nextState)));
        allCases.append(StringFormatter.format("{0}      $wasEventProcessed = true;\n",spaceOffset));
  
        if (t.getGuard() != null)
        {
          allCases.append(StringFormatter.format("      }\n"));
        }
      }
      allCases.append(StringFormatter.format("    }"));
      first = false;
    }
    firstStateMachine = false;
  }
  String outputCases = allDeclarations.toString() + allCases.toString();

    stringBuffer.append(TEXT_280);
    stringBuffer.append(gen.translate("eventMethod",e));
    stringBuffer.append(TEXT_281);
    stringBuffer.append(TEXT_282);
    stringBuffer.append( outputCases );
    stringBuffer.append(TEXT_283);
    
  }
}

    
{
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -Dmyenv=FILL_ME_IN.xml codegenMoveTemplates to move into the appropriate projects
  for (StateMachine sm : uClass.getAllStateMachines())  
  {

    if (sm.getType() == "Simple" && sm.numberOfStates() > 0)
    {
      
    
  
  StringBuffer allCases = new StringBuffer();
  StringBuffer allExitCases = new StringBuffer();
  StringBuffer allEnterCases = new StringBuffer();

  for (State state : sm.getStates())
  {
    if (state.getIsStartState())
    {
      allCases.append(StringFormatter.format("if"));
    }
    else
    {
      allCases.append(StringFormatter.format("    elseif"));
    }
    allCases.append(StringFormatter.format(" (${0} == \"{1}\" || ${0} == self::${1})\n",gen.translate("parameterOne",sm),gen.translate("stateOne",state)));
    allCases.append(StringFormatter.format("    {\n"));
    allCases.append(StringFormatter.format("      $this->{0} = self::${1};\n",gen.translate("stateMachineOne",sm),gen.translate("stateOne",state)));
    allCases.append(StringFormatter.format("      return true;\n"));
    allCases.append(StringFormatter.format("    }\n"));

    if (state.getHasExitAction())
    {
      allExitCases.append(StringFormatter.format("    if ($this->{0} == self::${1} && (${2} != self::${1} && ${2} != \"{1}\") ) { $this->{3}(); }\n"
        , gen.translate("stateMachineOne",sm)
        , gen.translate("stateOne",state)
        , gen.translate("parameterOne",sm)
        , gen.translate("exitMethod",state)
      ));
    }

    if (state.getHasEntryAction())
    {
      allEnterCases.append(StringFormatter.format("    if ($this->{0} != self::${1} && (${2} == self::${1} || ${2} == \"{1}\") ) { $this->{3}(); }\n"
        , gen.translate("stateMachineOne",sm)
        , gen.translate("stateOne",state)
        , gen.translate("parameterOne",sm)
        , gen.translate("enterMethod",state)
      ));
    }

  }
  String outputCases = allCases.toString().trim();
  String exitCasesOutput = allExitCases.toString().trim();
  String enterCasesOutput = allEnterCases.toString().trim();


    stringBuffer.append(TEXT_284);
    stringBuffer.append(gen.translate("setMethod",sm));
    stringBuffer.append(TEXT_285);
    stringBuffer.append( gen.translate("parameterOne",sm) );
    stringBuffer.append(TEXT_286);
     if (!exitCasesOutput.isEmpty()) { append(stringBuffer, "\n    {0}",exitCasesOutput); } 
     if (!enterCasesOutput.isEmpty()) { append(stringBuffer, "\n    {0}",enterCasesOutput); } 
    stringBuffer.append(TEXT_287);
    stringBuffer.append( outputCases );
    stringBuffer.append(TEXT_288);
    
    }
    else if (sm.numberOfStates() > 0)
    {
      
    
  boolean hasEntry = false;
  boolean hasExit = false;
  boolean isFirstEntry = true;
  boolean isFirstExit = true;
  State parentState = sm.getParentState();
  StateMachine parentSm = parentState != null ? parentState.getStateMachine() : null;
  String customSetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("setMethod",sm)));
  String customSetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("setMethod",sm)));
  String customExitPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("exitMethod",sm)));
  String customExitPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("exitMethod",sm)));

  StringBuilder entryActions = new StringBuilder();
  StringBuilder exitActions = new StringBuilder();
  for(State state : sm.getStates())
  {
    boolean hasThisEntry = false;
    boolean hasThisExit = false;
    
    for(Action action : state.getActions())
    {
      if ("entry".equals(action.getActionType()))
      {
        if (!hasThisEntry)
        {
          if (isFirstEntry)
          {
            entryActions.append(StringFormatter.format("if ($this->{0} == self::${1})\n    {",gen.translate("stateMachineOne",sm),gen.translate("stateOne",state)));
            for( TraceDirective tc : uClass.getTraceDirectives() )
          	{
                for( int i = 0 ; i < tc.numberOfStateMachineTraceItems() ; ++ i )
                {
              	  StateMachine_TraceItem tracedState = tc.getStateMachineTraceItem(i);
          		  StateMachine stm = tracedState.getStateMachine();
          		  for( int j = 0 ; j < stm.numberOfStates() ; ++j )
          		  {
          		  	State stat = stm.getState(j);
          		  	String statName =  stm.getName() + stat.getName();
          		  	if( tracedState.getEntry() )
          			  if( statName.equalsIgnoreCase(gen.translate("stateOne",state)))
              			if( model.getTraceType().equals("Console"))
          					entryActions.append(StringFormatter.format( "\n      " + "print(\"Tracing state {0} entry action(s)\");",gen.translate("stateOne",state)));
           				else if( model.getTraceType().equals("File"))
           					entryActions.append(StringFormatter.format( "\n      " + "fileTracer(\"Tracing state {0} entry action(s)\");",gen.translate("stateOne",state))); 
           		  }
          	  }
          	}
          }
          else
          {
            entryActions.append("\n    ");
            entryActions.append(StringFormatter.format("elseif ($this->{0} == self::${1})\n    {",gen.translate("stateMachineOne",sm),gen.translate("stateOne",state)));
          }
        }
        hasEntry = true;
        hasThisEntry = true;
        isFirstEntry = false;
        entryActions.append("\n      " + action.getActionCode());
      }
      else if ("exit".equals(action.getActionType()))
      {
        if (!hasThisExit)
        {
          if (isFirstExit)
          {
            exitActions.append(StringFormatter.format("if ($this->{0} == self::${1})\n    {",gen.translate("stateMachineOne",sm),gen.translate("stateOne",state)));
            for( TraceDirective tc : uClass.getTraceDirectives() )
        	{
              for( int i = 0 ; i < tc.numberOfStateMachineTraceItems() ; ++ i )
              {
            	  StateMachine_TraceItem tracedState = tc.getStateMachineTraceItem(i);
        		  StateMachine stm = tracedState.getStateMachine();
        		  for( int j = 0 ; j < stm.numberOfStates() ; ++j )
        		  {
        		  	State stat = stm.getState(j);
        		  	String statName =  stm.getName() + stat.getName();
        		  	if( tracedState.getExit() )
        			  if( statName.equalsIgnoreCase(gen.translate("stateOne",state)))
            			if( model.getTraceType().equals("Console"))
            				exitActions.append(StringFormatter.format( "\n      " + "print(\"Tracing state {0} exit action(s)\");",gen.translate("stateOne",state)));
         				else if( model.getTraceType().equals("File"))
         					exitActions.append(StringFormatter.format( "\n      " + "fileTracer(\"Tracing state {0} exit action(s)\");",gen.translate("stateOne",state))); 
         		  }
        	  }
        	}
          }
          else
          {
            exitActions.append("\n    ");
            exitActions.append(StringFormatter.format("elseif ($this->{0} == self::${1})\n    {",gen.translate("stateMachineOne",sm),gen.translate("stateOne",state)));
          }
          isFirstExit = false;
        }
        hasExit = true;
        hasThisExit = true;
        isFirstExit = false;
        exitActions.append("\n      " + action.getActionCode());
      }
    }
  
    if (state.getActivity() != null)
    {
      if (!hasThisEntry)
      {
        if (isFirstEntry)
        {
          entryActions.append(StringFormatter.format("if ($this->{0} == self::${1})\n    {",gen.translate("stateMachineOne",sm),gen.translate("stateOne",state)));
        }
        else
        {
          entryActions.append("\n    ");
          entryActions.append(StringFormatter.format("elseif ($this->{0} == self::${1})\n    {",gen.translate("stateMachineOne",sm),gen.translate("stateOne",state)));
        }
      }
      hasEntry = true;
      hasThisEntry = true;
      isFirstEntry = false;
      entryActions.append(StringFormatter.format("\n      {0}",state.getActivity().getActivityCode()));
    }
    
    if (hasThisEntry)
    {
      entryActions.append("\n    }");
    }
    
    if (hasThisExit)
    {
      exitActions.append("\n    }");
    }
  }

     if (hasExit) { 
    stringBuffer.append(TEXT_289);
    stringBuffer.append(gen.translate("exitMethod",sm));
    stringBuffer.append(TEXT_290);
     if (customExitPrefixCode != null) { append(stringBuffer, "\n    {0}", customExitPrefixCode); } 
    stringBuffer.append(TEXT_291);
    stringBuffer.append( exitActions );
     if (customExitPostfixCode != null) { append(stringBuffer, "\n    {0}", customExitPostfixCode); } 
    stringBuffer.append(TEXT_292);
     } 
    stringBuffer.append(TEXT_293);
    stringBuffer.append(gen.translate("setMethod",sm));
    stringBuffer.append(TEXT_294);
    stringBuffer.append( gen.translate("parameterOne",sm) );
    stringBuffer.append(TEXT_295);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n    {0}", customSetPrefixCode); } 
    stringBuffer.append(TEXT_296);
    stringBuffer.append( gen.translate("stateMachineOne",sm) );
    stringBuffer.append(TEXT_297);
    stringBuffer.append( gen.translate("parameterOne",sm) );
    stringBuffer.append(TEXT_298);
     if (parentState != null) { 
    stringBuffer.append(TEXT_299);
    stringBuffer.append( gen.translate("stateMachineOne",parentSm) );
    stringBuffer.append(TEXT_300);
    stringBuffer.append( gen.translate("stateOne",parentState) );
    stringBuffer.append(TEXT_301);
    stringBuffer.append( gen.translate("parameterOne",sm) );
    stringBuffer.append(TEXT_302);
    stringBuffer.append( gen.translate("stateNull",sm) );
    stringBuffer.append(TEXT_303);
    stringBuffer.append(gen.translate("setMethod",parentSm));
    stringBuffer.append(TEXT_304);
    stringBuffer.append( gen.translate("stateOne",parentState) );
    stringBuffer.append(TEXT_305);
     } 
     if (customSetPostfixCode != null) { append(stringBuffer, "\n    {0}", customSetPostfixCode); } 
     if (hasEntry) { 
    stringBuffer.append(TEXT_306);
    stringBuffer.append(TEXT_307);
    stringBuffer.append( entryActions );
     } 
    stringBuffer.append(TEXT_308);
    
    }
  }
}

    
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -Dmyenv=FILL_ME_IN.xml codegenMoveTemplates to move into the appropriate projects
  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {

    if (!av.getIsNavigable())
    {
      continue;
    }

    String customGetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getMethod",av)));
    String customGetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getMethod",av)));

    String customGetDefaultPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getDefaultMethod",av)));
    String customGetDefaultPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getDefaultMethod",av)));

    String customGetManyPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getManyMethod",av)));
    String customGetManyPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getManyMethod",av)));

    String customNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("numberOfMethod",av)));
    String customNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("numberOfMethod",av)));

    String customHasManyPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("hasManyMethod",av)));
    String customHasManyPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("hasManyMethod",av)));

    String customIndexOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("indexOfMethod",av)));
    String customIndexOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("indexOfMethod",av)));

    boolean hasCodeInjections = customGetPrefixCode != null || customGetPostfixCode != null;
  
    if (av.isOne())
    {
      
    stringBuffer.append(TEXT_309);
    stringBuffer.append(gen.translate("getMethod",av));
    stringBuffer.append(TEXT_310);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n    {0}",customGetPrefixCode); } 
     if (customGetPostfixCode == null) { 
    stringBuffer.append(TEXT_311);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_312);
     } else { 
    stringBuffer.append(TEXT_313);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_314);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_315);
     append(stringBuffer, "\n    {0}",customGetPostfixCode); 
    stringBuffer.append(TEXT_316);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_317);
     } 
    stringBuffer.append(TEXT_318);
    
    }
    else if (av.isMany())
    {
      
    stringBuffer.append(TEXT_319);
    stringBuffer.append(gen.translate("getMethod",av));
    stringBuffer.append(TEXT_320);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n    {0}",customGetPrefixCode); } 
    stringBuffer.append(TEXT_321);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_322);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_323);
     if (customGetPostfixCode != null) { append(stringBuffer, "\n    {0}",customGetPostfixCode); } 
    stringBuffer.append(TEXT_324);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_325);
    stringBuffer.append(gen.translate("getManyMethod",av));
    stringBuffer.append(TEXT_326);
     if (customGetManyPrefixCode != null) { append(stringBuffer, "\n    {0}",customGetManyPrefixCode); } 
    stringBuffer.append(TEXT_327);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_328);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_329);
     if (customGetManyPostfixCode != null) { append(stringBuffer, "\n    {0}",customGetManyPostfixCode); } 
    stringBuffer.append(TEXT_330);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_331);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_332);
     if (customNumberOfPrefixCode != null) { append(stringBuffer, "\n    {0}",customNumberOfPrefixCode); } 
    stringBuffer.append(TEXT_333);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_334);
     if (customNumberOfPostfixCode != null) { append(stringBuffer, "\n    {0}",customNumberOfPostfixCode); } 
    stringBuffer.append(TEXT_335);
    stringBuffer.append(gen.translate("hasManyMethod",av));
    stringBuffer.append(TEXT_336);
     if (customHasManyPrefixCode != null) { append(stringBuffer, "\n    {0}",customHasManyPrefixCode); } 
    stringBuffer.append(TEXT_337);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_338);
     if (customHasManyPostfixCode != null) { append(stringBuffer, "\n    {0}",customHasManyPostfixCode); } 
    stringBuffer.append(TEXT_339);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_340);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_341);
     if (customIndexOfPrefixCode != null) { append(stringBuffer, "\n    {0}",customIndexOfPrefixCode); } 
    stringBuffer.append(TEXT_342);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_343);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_344);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_345);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_346);
     if (customIndexOfPostfixCode != null) { append(stringBuffer, "\n    {0}",customIndexOfPostfixCode); } 
    stringBuffer.append(TEXT_347);
    
    }
    else
    {
      
    stringBuffer.append(TEXT_348);
    
    }
 }

    
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -Dmyenv=FILL_ME_IN.xml codegenMoveTemplates to move into the appropriate projects
  for (AssociationVariable av : uClass.getAssociationVariables())
  {
  
    AssociationVariable relatedAssociation = av.getRelatedAssociation();

    if (!av.getIsNavigable())
    {
      continue;
    } 

    String customSetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("setMethod",av)));
    String customSetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("setMethod",av)));

    String customSetManyPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("setManyMethod",av)));
    String customSetManyPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("setManyMethod",av)));

    String customAddPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("addMethod",av)));
    String customAddPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("addMethod",av)));
  
    String customRemovePrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("removeMethod",av)));
    String customRemovePostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("removeMethod",av)));

    String customIsNumberOfValidPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("isNumberOfValidMethod",av)));
    String customIsNumberOfValidPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("isNumberOfValidMethod",av)));
    
    String includeFileOne = null;
    String includeFileTwo = null;
    
    boolean hasIsNumberOfValidMethod = false;
    boolean hasAddManyToManyTemplateMethod = false;
    boolean hasMaximumNumberOfMethod = av.isMany() && !av.isStar();
    boolean hasMinimumNumberOfMethod = av.isMany();
    boolean hasRequiredNumberOfMethod = av.isN();
    boolean hasRemoveManyTemplateMethod = false;
    String includeFile = null;
    String includeFile2 = null;


    if (!relatedAssociation.getIsNavigable())
    {
      if (av.isOptionalOne())
      {
        includeFile = "association_SetUnidirectionalOptionalOne.jet";
      }
      else if (av.isOnlyOne())
      {
        includeFile = "association_SetUnidirectionalOne.jet";
      }
      else if (av.isMStar())
      {
        includeFile = "association_AddUnidirectionalMStar.jet";
        includeFile2 = "association_SetUnidirectionalMStar.jet";
      }
      else if (av.isMN())
      {
        includeFile = "association_AddUnidirectionalMN.jet";
        includeFile2 = "association_SetUnidirectionalMN.jet";
      }
      else if (av.isN())
      {
        includeFile = "association_SetUnidirectionalN.jet";
      }
      else if (av.isOptionalN())
      {
        includeFile = "association_AddUnidirectionalOptionalN.jet";
        includeFile2 = "association_SetUnidirectionalOptionalN.jet";
      }
      else if (av.isMany())
      {
        includeFile = "association_AddUnidirectionalMany.jet";
      }
    }
    else if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
    {
      //ignore
    }  
    else if (av.isN() && relatedAssociation.isOptionalOne())
    { 
      includeFile = "association_SetNToOptionalOne.jet";
    }
    else if (av.isMN() && relatedAssociation.isOptionalOne())
    {
      includeFile = "association_AddMNToOptionalOne.jet";
      includeFile2 = "association_SetMNToOptionalOne.jet";
    }
    else if (av.isMandatoryMany() && av.isStar() && relatedAssociation.isMany())
    {
      hasIsNumberOfValidMethod = true;
      hasAddManyToManyTemplateMethod = true;
      includeFile = "association_AddMStarToMany.jet";
      includeFile2 = "association_SetMStarToMany.jet";
    }
    else if ((av.isMN() || av.isN()) && relatedAssociation.isMandatoryMany())
    {
      hasIsNumberOfValidMethod = true;
      hasAddManyToManyTemplateMethod = true;
      hasAddManyToManyTemplateMethod = true;
      includeFile = "association_AddMNToMany.jet";
      includeFile2 = "association_SetMNToMany.jet";
    }
    else if ((av.isMN() || av.isN()) && relatedAssociation.isOptionalN())
    {
      hasIsNumberOfValidMethod = true;
      hasAddManyToManyTemplateMethod = true;
      hasAddManyToManyTemplateMethod = true;
      includeFile = "association_AddMNToMany.jet";
    }
    else if ((av.isMN() || av.isN()) && !relatedAssociation.isOne())
    {
      hasIsNumberOfValidMethod = true;
      hasAddManyToManyTemplateMethod = true;
      includeFile = "association_AddMNToMany.jet";
      includeFile2 = "association_SetMNToMany.jet";
    }
    else if (av.isOptionalOne() && relatedAssociation.isOptionalOne())
    {
      includeFile = "association_SetOptionalOneToOptionalOne.jet";
    }
    else if (av.isOptionalOne() && relatedAssociation.isOne())
    {
      includeFile = "association_SetOptionalOneToOne.jet";
    }
    else if (av.isOne() && relatedAssociation.isOptionalOne())
    {
      includeFile = "association_SetOneToOptionalOne.jet";
    }
    else if (av.isMandatoryMany() && av.isStar() && relatedAssociation.isOne())
    {
      hasIsNumberOfValidMethod = true;
      includeFile = "association_AddMandatoryManyToOne.jet";
    }
    else if ((av.isMN() || av.isN()) && relatedAssociation.isOnlyOne())
    {
      hasIsNumberOfValidMethod = true;
      includeFile = "association_AddMNToOnlyOne.jet";
    }
    else if (av.isOptionalN() && relatedAssociation.isOnlyOne())
    {
      includeFile = "association_AddOptionalNToOne.jet";
    }
    else if (av.isOptionalN() && (relatedAssociation.isMN() || relatedAssociation.isOptionalN()))
    {
      hasAddManyToManyTemplateMethod = true;
      hasRemoveManyTemplateMethod = true;
    }
    else if (av.isOptionalN() && relatedAssociation.isOptionalMany())
    {
      hasAddManyToManyTemplateMethod = true;
      hasRemoveManyTemplateMethod = true;
      includeFile = "association_SetOptionalNToMany.jet";
    }
    else if (av.isMany() && relatedAssociation.isOnlyOne())
    {
      includeFile = "association_AddManyToOne.jet";
    }
    else if (av.isOptionalN() && (relatedAssociation.isMN() || relatedAssociation.isN()))
    {
      hasAddManyToManyTemplateMethod = true;
      hasRemoveManyTemplateMethod = true;
    }
    else if (av.isMany() && (relatedAssociation.isMN() || relatedAssociation.isN() || relatedAssociation.isMany()))
    {
      hasAddManyToManyTemplateMethod = true;
      hasRemoveManyTemplateMethod = true;
    }
    else if (av.isOptionalN() && relatedAssociation.isOptionalOne())
    {
      includeFile = "association_AddOptionalNToOptionalOne.jet";
    }
    else if (av.isMany() && relatedAssociation.isOptionalOne())
    {
      includeFile = "association_AddManyToOptionalOne.jet";
    }
    else if (av.isOnlyOne() && relatedAssociation.isMandatoryMany() && relatedAssociation.isStar())
    {
      includeFile = "association_SetOneToMandatoryMany.jet";
    }
    else if (av.isOnlyOne() && (relatedAssociation.isMN() || relatedAssociation.isN()))
    {
      includeFile = "association_SetOneToAtMostN.jet";
    }
    else if (av.isOnlyOne() && relatedAssociation.isOptionalN())
    {
      includeFile = "association_SetOneToAtMostN.jet";
    }
    else if (av.isOnlyOne() && relatedAssociation.isMany() && !(av.isMandatory() && !av.isOne()))
    {
      includeFile = "association_SetOneToMany.jet";
    }
    else if (av.isOptionalOne() && relatedAssociation.isOptionalN())
    {
      includeFile = "association_SetOptionalOneToOptionalN.jet";
    }
    else if (av.isOptionalOne() && relatedAssociation.isOptionalMany())
    {
      includeFile = "association_SetOptionalOneToMany.jet";
    }
    else if (av.isOptionalOne() && relatedAssociation.isMandatory())
    {
      //ignore
    }
    else
    {
      
    stringBuffer.append(TEXT_349);
    stringBuffer.append(av);
    stringBuffer.append(TEXT_350);
    stringBuffer.append(relatedAssociation);
    
    }

    boolean addNewLine = false;
    if (hasIsNumberOfValidMethod)
    {
      if (addNewLine) { appendln(stringBuffer,""); }
      addNewLine = true;
      
    stringBuffer.append(TEXT_351);
    stringBuffer.append(gen.translate("isNumberOfValidMethod",av));
    stringBuffer.append(TEXT_352);
     if (customIsNumberOfValidPrefixCode != null) { append(stringBuffer, "\n    {0}",customIsNumberOfValidPrefixCode); } 
     if (av.getMultiplicity().isUpperBoundMany()) { 
    stringBuffer.append(TEXT_353);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_354);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_355);
     } else { 
    stringBuffer.append(TEXT_356);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_357);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_358);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_359);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_360);
     } 
     if (customIsNumberOfValidPostfixCode != null) { append(stringBuffer, "\n    {0}",customIsNumberOfValidPostfixCode); } 
    stringBuffer.append(TEXT_361);
    
    }
    
    if (hasRequiredNumberOfMethod)
    {
      if (addNewLine) { appendln(stringBuffer,""); }
      addNewLine = true;
      
    
    String customRequiredNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("requiredNumberOfMethod",av)));
    String customRequiredNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("requiredNumberOfMethod",av)));

     if (customRequiredNumberOfPrefixCode == null && customRequiredNumberOfPostfixCode == null) { 
    stringBuffer.append(TEXT_362);
    stringBuffer.append(gen.translate("requiredNumberOfMethod",av));
    stringBuffer.append(TEXT_363);
    stringBuffer.append(av.getMultiplicity().getLowerBound());
    stringBuffer.append(TEXT_364);
     } else { 
    stringBuffer.append(TEXT_365);
    stringBuffer.append(gen.translate("requiredNumberOfMethod",av));
    stringBuffer.append(TEXT_366);
     if (customRequiredNumberOfPrefixCode != null) { append(stringBuffer, "\n    {0}",customRequiredNumberOfPrefixCode); } 
    stringBuffer.append(TEXT_367);
    stringBuffer.append(av.getMultiplicity().getLowerBound());
    stringBuffer.append(TEXT_368);
     if (customRequiredNumberOfPostfixCode != null) { append(stringBuffer, "\n    {0}",customRequiredNumberOfPostfixCode); } 
    stringBuffer.append(TEXT_369);
     } 
    
    }

    if (hasMinimumNumberOfMethod)
    {
      if (addNewLine) { appendln(stringBuffer,""); }
      addNewLine = true;
      
    
    String customMinimumNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("minimumNumberOfMethod",av)));
    String customMinimumNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("minimumNumberOfMethod",av)));

     if (customMinimumNumberOfPrefixCode == null && customMinimumNumberOfPostfixCode == null) { 
    stringBuffer.append(TEXT_370);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_371);
    stringBuffer.append(av.getMultiplicity().getLowerBound());
    stringBuffer.append(TEXT_372);
     } else { 
    stringBuffer.append(TEXT_373);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_374);
     if (customMinimumNumberOfPrefixCode != null) { append(stringBuffer, "\n    {0}",customMinimumNumberOfPrefixCode); } 
    stringBuffer.append(TEXT_375);
    stringBuffer.append(av.getMultiplicity().getLowerBound());
    stringBuffer.append(TEXT_376);
     if (customMinimumNumberOfPostfixCode != null) { append(stringBuffer, "\n    {0}",customMinimumNumberOfPostfixCode); } 
    stringBuffer.append(TEXT_377);
     } 
    
    }
    
    if (hasMaximumNumberOfMethod)
    {
      if (addNewLine) { appendln(stringBuffer,""); }
      addNewLine = true;
      
    
    String customMaximumNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("maximumNumberOfMethod",av)));
    String customMaximumNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("maximumNumberOfMethod",av)));

     if (customMaximumNumberOfPrefixCode == null && customMaximumNumberOfPostfixCode == null) { 
    stringBuffer.append(TEXT_378);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_379);
    stringBuffer.append(av.getMultiplicity().getUpperBound());
    stringBuffer.append(TEXT_380);
     } else { 
    stringBuffer.append(TEXT_381);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_382);
     if (customMaximumNumberOfPrefixCode != null) { append(stringBuffer, "\n    {0}",customMaximumNumberOfPrefixCode); } 
    stringBuffer.append(TEXT_383);
    stringBuffer.append(av.getMultiplicity().getUpperBound());
    stringBuffer.append(TEXT_384);
     if (customMaximumNumberOfPostfixCode != null) { append(stringBuffer, "\n    {0}",customMaximumNumberOfPostfixCode); } 
    stringBuffer.append(TEXT_385);
     } 
    
    }
    
    if (hasAddManyToManyTemplateMethod)
    {
      if (addNewLine) { appendln(stringBuffer,""); }
      addNewLine = true;
      
    stringBuffer.append(TEXT_386);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_387);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_388);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n    {0}",customAddPrefixCode); } 
     if (!av.getMultiplicity().isUpperBoundMany()) { 
    stringBuffer.append(TEXT_389);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_390);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_391);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n      {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_392);
     } 
    stringBuffer.append(TEXT_393);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_394);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_395);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_396);
    stringBuffer.append(gen.relatedTranslate("indexOfMethod",av));
    stringBuffer.append(TEXT_397);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_398);
    stringBuffer.append(gen.relatedTranslate("addMethod",av));
    stringBuffer.append(TEXT_399);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_400);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n      {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_401);
    
    }
    
    if (hasRemoveManyTemplateMethod)
    {
      if (addNewLine) { appendln(stringBuffer,""); }
      addNewLine = true;
      
    stringBuffer.append(TEXT_402);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_403);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_404);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n    {0}",customRemovePrefixCode); } 
    stringBuffer.append(TEXT_405);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_406);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_407);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n      {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_408);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_409);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_410);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_411);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_412);
    stringBuffer.append(gen.relatedTranslate("indexOfMethod",av));
    stringBuffer.append(TEXT_413);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_414);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_415);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_416);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_417);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_418);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_419);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_420);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n    {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_421);
    
    }

    if (addNewLine) { appendln(stringBuffer,""); }
    addNewLine = true;
    
    // How do you dynamically include a file in JET?!?
    if (includeFile == "association_SetUnidirectionalOptionalOne.jet")
    {
      
    stringBuffer.append(TEXT_422);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_423);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_424);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetPrefixCode); } 
    stringBuffer.append(TEXT_425);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_426);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_427);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_428);
    
    }
    else if (includeFile == "association_SetUnidirectionalOne.jet")
    {
      
    stringBuffer.append(TEXT_429);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_430);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_431);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetPrefixCode); } 
    stringBuffer.append(TEXT_432);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_433);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_434);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_435);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_436);
    
    }
    else if (includeFile == "association_SetOptionalOneToOne.jet")
    {
      
    stringBuffer.append(TEXT_437);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_438);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_439);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetPrefixCode); } 
    stringBuffer.append(TEXT_440);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_441);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_442);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_443);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_444);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_445);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_446);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_447);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetPrefixCode); } 
    stringBuffer.append(TEXT_448);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_449);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_450);
    stringBuffer.append(gen.relatedTranslate("parameterOld",av));
    stringBuffer.append(TEXT_451);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_452);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_453);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_454);
    stringBuffer.append(gen.relatedTranslate("parameterOld",av));
    stringBuffer.append(TEXT_455);
    stringBuffer.append(gen.relatedTranslate("parameterOld",av));
    stringBuffer.append(TEXT_456);
    stringBuffer.append(gen.relatedTranslate("parameterOld",av));
    stringBuffer.append(TEXT_457);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_458);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_459);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_460);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_461);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_462);
    
    }
    else if (includeFile == "association_SetOneToOptionalOne.jet")
    {
      
    stringBuffer.append(TEXT_463);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_464);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_465);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetPrefixCode); } 
    stringBuffer.append(TEXT_466);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_467);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_468);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_469);
    stringBuffer.append(gen.translate("associationOne",av));
     if (customSetPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_470);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_471);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_472);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_473);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_474);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_475);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_476);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_477);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_478);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_479);
    stringBuffer.append(gen.translate("parameterOld",av));
    stringBuffer.append(TEXT_480);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_481);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_482);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_483);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_484);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_485);
    stringBuffer.append(gen.translate("parameterOld",av));
    stringBuffer.append(TEXT_486);
    stringBuffer.append(gen.translate("parameterOld",av));
    stringBuffer.append(TEXT_487);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_488);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_489);
    
    }
    else if (includeFile == "association_AddMandatoryManyToOne.jet")
    {
      
    stringBuffer.append(TEXT_490);
    stringBuffer.append(gen.translate("addViaMethod",av));
    stringBuffer.append(TEXT_491);
    stringBuffer.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    stringBuffer.append(TEXT_492);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_493);
    stringBuffer.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    stringBuffer.append(TEXT_494);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_495);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_496);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n    {0}",customAddPrefixCode); } 
    stringBuffer.append(TEXT_497);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_498);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_499);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_500);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_501);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_502);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_503);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_504);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_505);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_506);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_507);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_508);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_509);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_510);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_511);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_512);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n    {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_513);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_514);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_515);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n    {0}",customRemovePrefixCode); } 
    stringBuffer.append(TEXT_516);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_517);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_518);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_519);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_520);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n      {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_521);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_522);
    stringBuffer.append(av.getMultiplicity().getLowerBound());
    stringBuffer.append(TEXT_523);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_524);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_525);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n      {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_526);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_527);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_528);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_529);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_530);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_531);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n    {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_532);
    
    }
    else if (includeFile == "association_AddMNToOnlyOne.jet")
    {
      
    stringBuffer.append(TEXT_533);
    stringBuffer.append(gen.translate("addViaMethod",av));
    stringBuffer.append(TEXT_534);
    stringBuffer.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    stringBuffer.append(TEXT_535);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_536);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_537);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_538);
    stringBuffer.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    stringBuffer.append(TEXT_539);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_540);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_541);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n    {0}",customAddPrefixCode); } 
    stringBuffer.append(TEXT_542);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_543);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_544);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n      {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_545);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_546);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_547);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_548);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_549);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_550);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_551);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_553);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_554);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_555);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n      {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_556);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_557);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_558);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_559);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_560);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_561);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n    {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_562);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_563);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_564);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n    {0}",customRemovePrefixCode); } 
    stringBuffer.append(TEXT_565);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_566);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_567);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_568);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_569);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n      {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_570);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_571);
    stringBuffer.append(av.getMultiplicity().getLowerBound());
    stringBuffer.append(TEXT_572);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_573);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_574);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n      {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_575);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_576);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_577);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_578);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_579);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_580);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n    {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_581);
    
    }
    else if (includeFile == "association_AddOptionalNToOne.jet")
    {
      
    stringBuffer.append(TEXT_582);
    stringBuffer.append(gen.translate("addViaMethod",av));
    stringBuffer.append(TEXT_583);
    stringBuffer.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    stringBuffer.append(TEXT_584);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_585);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_586);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_587);
    stringBuffer.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    stringBuffer.append(TEXT_588);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_589);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_590);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n    {0}",customAddPrefixCode); } 
    stringBuffer.append(TEXT_591);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_592);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_593);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n      {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_594);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_595);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_596);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_597);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_598);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_599);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_600);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_601);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_602);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_603);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_604);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_605);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n    {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_606);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_607);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_608);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n    {0}",customRemovePrefixCode); } 
    stringBuffer.append(TEXT_609);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_610);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_611);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_612);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_613);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_614);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_615);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_616);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_617);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_618);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n    {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_619);
    
    }
    else if (includeFile == "association_SetOptionalNToMany.jet")
    {
      
    stringBuffer.append(TEXT_620);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_621);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_622);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetManyPrefixCode); } 
    stringBuffer.append(TEXT_623);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_624);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_625);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_626);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_627);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_628);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_629);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_630);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_631);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_632);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_633);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_634);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_635);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_636);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_637);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_638);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_639);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_640);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_641);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_642);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_643);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_644);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_645);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_646);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_647);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_648);
    stringBuffer.append(gen.relatedTranslate("addMethod",av));
    stringBuffer.append(TEXT_649);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_650);
    stringBuffer.append(gen.translate("parameterOld",av));
    stringBuffer.append(TEXT_651);
    stringBuffer.append(gen.translate("parameterOld",av));
    stringBuffer.append(TEXT_652);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_653);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_654);
    
    }
    else if (includeFile == "association_AddManyToOne.jet")
    {
      
    stringBuffer.append(TEXT_655);
    stringBuffer.append(gen.translate("addViaMethod",av));
    stringBuffer.append(TEXT_656);
    stringBuffer.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    stringBuffer.append(TEXT_657);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_658);
    stringBuffer.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    stringBuffer.append(TEXT_659);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_660);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_661);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n    {0}",customAddPrefixCode); } 
    stringBuffer.append(TEXT_662);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_663);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_664);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_665);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_666);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_667);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_668);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_669);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_670);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_671);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_672);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_673);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n    {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_674);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_675);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_676);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n    {0}",customRemovePrefixCode); } 
    stringBuffer.append(TEXT_677);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_678);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_679);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_680);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_681);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_682);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_683);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_684);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_685);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_686);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n    {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_687);
    
    }
    else if (includeFile == "association_SetOptionalOneToOptionalOne.jet")
    {
      
    stringBuffer.append(TEXT_688);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_689);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_690);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetPrefixCode); } 
    stringBuffer.append(TEXT_691);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_692);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_693);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_694);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_695);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_696);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_697);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_698);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_699);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_700);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_701);
    stringBuffer.append(gen.translate("parameterCurrent",av));
    stringBuffer.append(TEXT_702);
    stringBuffer.append(gen.translate("getMethod",av));
    stringBuffer.append(TEXT_703);
    stringBuffer.append(gen.translate("parameterCurrent",av));
    stringBuffer.append(TEXT_704);
    stringBuffer.append(gen.translate("parameterCurrent",av));
    stringBuffer.append(TEXT_705);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_706);
    stringBuffer.append(gen.translate("parameterCurrent",av));
    stringBuffer.append(TEXT_707);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_708);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_709);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_710);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_711);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_712);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_713);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_714);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_715);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_716);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_717);
    
    }
    else if (includeFile == "association_AddMNToMany.jet")
    {
      
    stringBuffer.append(TEXT_718);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_719);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_720);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n    {0}",customRemovePrefixCode); } 
    stringBuffer.append(TEXT_721);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_722);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_723);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n      {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_724);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_725);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_726);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n      {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_727);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_728);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_729);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_730);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_731);
    stringBuffer.append(gen.relatedTranslate("indexOfMethod",av));
    stringBuffer.append(TEXT_732);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_733);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_734);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_735);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_736);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_737);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_738);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_739);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n    {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_740);
    
    }
    else if (includeFile == "association_AddMStarToMany.jet")
    {
      
    stringBuffer.append(TEXT_741);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_742);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_743);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n    {0}",customRemovePrefixCode); } 
    stringBuffer.append(TEXT_744);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_745);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_746);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n      {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_747);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_748);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_749);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n      {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_750);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_751);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_752);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_753);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_754);
    stringBuffer.append(gen.relatedTranslate("indexOfMethod",av));
    stringBuffer.append(TEXT_755);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_756);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_757);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_758);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_759);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_760);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_761);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_762);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n    {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_763);
    
    }
    else if (includeFile == "association_SetOptionalOneToOptionalN.jet")
    {
      
    stringBuffer.append(TEXT_764);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_765);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_766);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetPrefixCode); } 
    stringBuffer.append(TEXT_767);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_768);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_769);
    stringBuffer.append(gen.relatedTranslate("numberOfMethod",av));
    stringBuffer.append(TEXT_770);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_771);
    stringBuffer.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_772);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_773);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_774);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_775);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_776);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_777);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_778);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_779);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_780);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_781);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_782);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_783);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_784);
    stringBuffer.append(gen.relatedTranslate("addMethod",av));
    stringBuffer.append(TEXT_785);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_786);
    
    }
    else if (includeFile == "association_SetOneToMany.jet")
    {
      
    stringBuffer.append(TEXT_787);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_788);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_789);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetPrefixCode); } 
    stringBuffer.append(TEXT_790);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_791);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_792);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_793);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_794);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_795);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_796);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_797);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_798);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_799);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_800);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_801);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_802);
    stringBuffer.append(gen.relatedTranslate("addMethod",av));
    stringBuffer.append(TEXT_803);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_804);
    
    }
    else if (includeFile == "association_SetOneToAtMostN.jet")
    {
      
    stringBuffer.append(TEXT_805);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_806);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_807);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetPrefixCode); } 
    stringBuffer.append(TEXT_808);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_809);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_810);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_811);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_812);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_813);
    stringBuffer.append(relatedAssociation.getMultiplicity().getUpperBound());
    stringBuffer.append(TEXT_814);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_815);
    stringBuffer.append(gen.relatedTranslate("numberOfMethod",av));
    stringBuffer.append(TEXT_816);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_817);
    stringBuffer.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_818);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_819);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_820);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_821);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_822);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_823);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_824);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_825);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_826);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_827);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_828);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_829);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_830);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n        {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_831);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_832);
    stringBuffer.append(gen.relatedTranslate("addMethod",av));
    stringBuffer.append(TEXT_833);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_834);
    
    }
    else if (includeFile == "association_SetOneToMandatoryMany.jet")
    {
      
    stringBuffer.append(TEXT_835);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_836);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_837);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetPrefixCode); } 
    stringBuffer.append(TEXT_838);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_839);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_840);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_841);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_842);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_843);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_844);
    stringBuffer.append(gen.relatedTranslate("numberOfMethod",av));
    stringBuffer.append(TEXT_845);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_846);
    stringBuffer.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_847);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_848);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_849);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_850);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_851);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_852);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_853);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_854);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_855);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_856);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_857);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_858);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_859);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n        {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_860);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_861);
    stringBuffer.append(gen.relatedTranslate("addMethod",av));
    stringBuffer.append(TEXT_862);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_863);
    
    }
    else if (includeFile == "association_AddManyToOptionalOne.jet")
    {
      
    stringBuffer.append(TEXT_864);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_865);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_866);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n    {0}",customAddPrefixCode); } 
    stringBuffer.append(TEXT_867);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_868);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_869);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_870);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_871);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_872);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_873);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_874);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_875);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_876);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_877);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_878);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_879);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_880);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_881);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n    {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_882);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_883);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_884);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n    {0}",customRemovePrefixCode); } 
    stringBuffer.append(TEXT_885);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_886);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_887);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_888);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_889);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_890);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_891);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_892);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_893);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_894);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_895);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_896);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n    {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_897);
    
    }
    else if (includeFile == "association_SetOptionalOneToMany.jet")
    {
      
    stringBuffer.append(TEXT_898);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_899);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_900);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetPrefixCode); } 
    stringBuffer.append(TEXT_901);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_902);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_903);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_904);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_905);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_906);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_907);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_908);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_909);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_910);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_911);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_912);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_913);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_914);
    stringBuffer.append(gen.relatedTranslate("addMethod",av));
    stringBuffer.append(TEXT_915);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetPostfixCode); } 
    stringBuffer.append(TEXT_916);
    
    }
    else if (includeFile == "association_AddOptionalNToOptionalOne.jet")
    {
      
    stringBuffer.append(TEXT_917);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_918);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_919);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n    {0}",customAddPrefixCode); } 
    stringBuffer.append(TEXT_920);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_921);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_922);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n      {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_923);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_924);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_925);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_926);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_927);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_928);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_929);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_930);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_931);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_932);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_933);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_934);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_935);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_936);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_937);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n    {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_938);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_939);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_940);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n    {0}",customRemovePrefixCode); } 
    stringBuffer.append(TEXT_941);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_942);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_943);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_944);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_945);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_946);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_947);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_948);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_949);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_950);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n    {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_951);
    
    }
    else if (includeFile == "association_AddUnidirectionalMN.jet")
    {
      
    stringBuffer.append(TEXT_952);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_953);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_954);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n    {0}",customAddPrefixCode); } 
    stringBuffer.append(TEXT_955);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_956);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_957);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_958);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_959);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n    {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_960);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_961);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_962);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n    {0}",customRemovePrefixCode); } 
    stringBuffer.append(TEXT_963);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_964);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_965);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n      {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_966);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_967);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_968);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n      {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_969);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_970);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_971);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_972);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_973);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_974);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n    {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_975);
    
    }
    else if (includeFile == "association_AddMNToOptionalOne.jet")
    {
      
    stringBuffer.append(TEXT_976);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_977);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_978);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n    {0}",customAddPrefixCode); } 
     if (!av.isStar()) { 
    stringBuffer.append(TEXT_979);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_980);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_981);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n      {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_982);
     } 
    stringBuffer.append(TEXT_983);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_984);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_985);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_986);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_987);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_988);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_989);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_990);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n      {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_991);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_992);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_993);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_994);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_995);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_996);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_997);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_998);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_999);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1005);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n    {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1008);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n    {0}",customRemovePrefixCode); } 
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1020);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n    {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_1021);
    
    }
    else if (includeFile == "association_SetNToOptionalOne.jet")
    {
      
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1024);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetManyPrefixCode); } 
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(gen.translate("associationNew",av));
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(gen.translate("associationNew",av));
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1030);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n        {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(gen.translate("associationNew",av));
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(gen.translate("associationNew",av));
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1035);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n        {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(gen.translate("associationNew",av));
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1040);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(gen.translate("associationNew",av));
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(gen.translate("associationNew",av));
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(gen.translate("associationNew",av));
    stringBuffer.append(TEXT_1051);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(gen.relatedTranslate("parameterOne",av));
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(gen.relatedTranslate("parameterOne",av));
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(gen.relatedTranslate("parameterOne",av));
    stringBuffer.append(TEXT_1062);
    
    }
    else if (includeFile == "association_AddUnidirectionalMany.jet")
    {
      
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1065);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n    {0}",customAddPrefixCode); } 
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1068);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n    {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1071);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n    {0}",customRemovePrefixCode); } 
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1079);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n    {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_1080);
    
    }
    else if (includeFile == "association_AddUnidirectionalOptionalN.jet")
    {
      
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1083);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n    {0}",customAddPrefixCode); } 
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1088);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n    {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1091);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n    {0}",customRemovePrefixCode); } 
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1099);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n    {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_1100);
    
    }
    else if (includeFile == "association_AddUnidirectionalMStar.jet")
    {
      
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1103);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n    {0}",customAddPrefixCode); } 
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1106);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n    {0}",customAddPostfixCode); } 
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1109);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n    {0}",customRemovePrefixCode); } 
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1112);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n      {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1115);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n      {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1121);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n    {0}",customRemovePostfixCode); } 
    stringBuffer.append(TEXT_1122);
    
    }
    else if (includeFile == "association_SetUnidirectionalN.jet")
    {
      
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1125);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetManyPrefixCode); } 
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(gen.translate("requiredNumberOfMethod",av));
    stringBuffer.append(TEXT_1137);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1140);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1141);
    
    }
    else if (includeFile != null)
    {
      appendln(stringBuffer,"You forgot to include {0}",includeFile);
    }
    
    if (includeFile2 == "association_SetMNToMany.jet")
    {
      
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1144);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetManyPrefixCode); } 
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_1158);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1159);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1170);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(gen.relatedTranslate("addMethod",av));
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(gen.translate("parameterOld",av));
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(gen.translate("parameterOld",av));
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1177);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1178);
    
    }
    else if (includeFile2 == "association_SetMStarToMany.jet")
    {
      
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1181);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetManyPrefixCode); } 
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1193);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(gen.relatedTranslate("addMethod",av));
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(gen.translate("parameterOld",av));
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(gen.translate("parameterOld",av));
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1212);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1213);
    
    }
    else if (includeFile2 == "association_SetUnidirectionalMN.jet")
    {
      
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1216);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetManyPrefixCode); } 
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1220);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1225);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_1230);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1233);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1234);
    
    }
    else if (includeFile2 == "association_SetMNToOptionalOne.jet")
    {
      
    
  String existingToNewMap = StringFormatter.format("{0}ToNew{1}", relatedAssociation.getName(), av.getUpperCaseName());
  String orCheckMaxBound = av.isStar() ? "" : StringFormatter.format(" || count(${0}) > self::{1}()", gen.translate("parameterMany",av), gen.translate("maximumNumberOfMethod",av));

    stringBuffer.append(TEXT_1235);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1237);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetManyPrefixCode); } 
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(orCheckMaxBound);
    stringBuffer.append(TEXT_1241);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(existingToNewMap);
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1246);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1248);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n        {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1255);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(gen.relatedTranslate("parameterExistingSerialized",av));
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(gen.relatedTranslate("parameterExistingSerialized",av));
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(existingToNewMap);
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(existingToNewMap);
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(gen.relatedTranslate("parameterExistingSerialized",av));
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(existingToNewMap);
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(gen.relatedTranslate("parameterExistingSerialized",av));
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_1267);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n        {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(existingToNewMap);
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(gen.relatedTranslate("parameterExistingSerialized",av));
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1297);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(TEXT_1299);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(gen.relatedTranslate("parameterOne",av));
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(gen.relatedTranslate("parameterOne",av));
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(gen.relatedTranslate("parameterOne",av));
    stringBuffer.append(TEXT_1308);
    
    }
    else if (includeFile2 == "association_SetUnidirectionalOptionalN.jet")
    {
      
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1311);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetManyPrefixCode); } 
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1318);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_1323);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1326);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1327);
    
    }
    else if (includeFile2 == "association_SetUnidirectionalMStar.jet")
    {
      
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1330);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n    {0}",customSetManyPrefixCode); } 
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1336);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1342);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n      {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1343);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1345);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n    {0}",customSetManyPostfixCode); } 
    stringBuffer.append(TEXT_1346);
    
    }
    else if (includeFile2 != null)
    {
      appendln(stringBuffer,"You forgot to include {0}",includeFile2);
    }
  }

     if (uClass.getKey().isProvided()) { 
    

  StringBuilder checks = new StringBuilder();
  StringBuilder hash = new StringBuilder();
  StringBuilder canSet = new StringBuilder();
  
  for(String memberId : uClass.getKey().getMembers())
  {
    Attribute av = uClass.getAttribute(memberId);
    AssociationVariable as = uClass.getAssociationVariable(memberId);
    if (av != null)
    {
      String attributeLabel = av.getIsList() ? "attributeMany" : "attributeOne";
      canSet.append(StringFormatter.format("    $this->{0} = false;\n",gen.translate("attributeCanSet",av)));
      checks.append(StringFormatter.format("    if ($this->{0} != $compareTo->{0})\n",gen.translate(attributeLabel,av)));
      checks.append(StringFormatter.format("    {\n"));
      checks.append(StringFormatter.format("      return false;\n"));
      checks.append(StringFormatter.format("    }\n"));
      checks.append("\n");
    }
    else if (as != null)
    {
      String associationLabel = as.isMany() ? "associationMany" : "associationOne";
      canSet.append(StringFormatter.format("    $this->{0} = false;\n",gen.translate("associationCanSet",as)));
      checks.append(StringFormatter.format("    if ($this->{0} != $compareTo->{0})\n",gen.translate(associationLabel,as)));
      checks.append(StringFormatter.format("    {\n"));
      checks.append(StringFormatter.format("      return false;\n"));
      checks.append(StringFormatter.format("    }\n"));
      checks.append("\n");
    }
    
    if (av != null)
    {
      if (("Integer".equals(av.getType()) || "Double".equals(av.getType())) && !av.getIsList())
      {
        hash.append(StringFormatter.format("    $this->cachedHashCode = $this->cachedHashCode * 23 + $this->{0};\n",gen.translate("attributeOne",av)));
      }
      else if ("Boolean".equals(av.getType()) && !av.getIsList())
      {
        hash.append(StringFormatter.format("    $this->cachedHashCode = $this->cachedHashCode * 23 + ($this->{0} ? 1 : 0);\n",gen.translate("attributeOne",av)));
      }
      else
      {
        String attributeType = av.getIsList() ? "attributeMany" : "attributeOne";
        hash.append(StringFormatter.format("    if ($this->{0} != null)\n",gen.translate(attributeType,av)));
        hash.append(StringFormatter.format("    {\n"));
        hash.append(StringFormatter.format("      $this->cachedHashCode = $this->cachedHashCode * 23 + spl_object_hash($this->{0});\n",gen.translate(attributeType,av)));
        hash.append(StringFormatter.format("    }\n"));
        hash.append(StringFormatter.format("    else\n"));
        hash.append(StringFormatter.format("    {\n"));
        hash.append(StringFormatter.format("      $this->cachedHashCode = $this->cachedHashCode * 23;\n"));
        hash.append(StringFormatter.format("    }\n"));
      }
      hash.append("\n");
    }
    else if (as != null)
    {
      String attributeType = as.isOne() ? "attributeOne" : "attributeMany";
      hash.append(StringFormatter.format("    if ($this->{0} != null)\n",gen.translate(attributeType,as)));
      hash.append(StringFormatter.format("    {\n"));
      hash.append(StringFormatter.format("      $this->cachedHashCode = $this->cachedHashCode * 23 + spl_object_hash($this->{0});\n",gen.translate(attributeType,as)));
      hash.append(StringFormatter.format("    }\n"));
      hash.append(StringFormatter.format("    else\n"));
      hash.append(StringFormatter.format("    {\n"));
      hash.append(StringFormatter.format("      $this->cachedHashCode = $this->cachedHashCode * 23;\n"));
      hash.append(StringFormatter.format("    }\n"));
    }
  }


    stringBuffer.append(TEXT_1347);
    stringBuffer.append(TEXT_1348);
    stringBuffer.append( checks.toString().trim() );
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(TEXT_1350);
    stringBuffer.append( hash.toString().trim() );
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(TEXT_1352);
    stringBuffer.append( canSet.toString().trim() );
    stringBuffer.append(TEXT_1353);
     } else { 
    stringBuffer.append(TEXT_1354);
     } 
    

  appendln(stringBuffer,"");
  appendln(stringBuffer,"  public function delete()");
  append(stringBuffer,"  {");

  boolean hasSomethingToDelete = false;

  String customDeletePrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before","delete"));
  String customDeletePostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after","delete"));

  if (customDeletePrefixCode != null) 
  {
    append(stringBuffer, "\n    {0}",customDeletePrefixCode);
    hasSomethingToDelete = true;
  }

  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {
    AssociationVariable relatedAssociation = av.getRelatedAssociation();
    
    if (!av.getIsNavigable())
    {
      continue;
    }
    
    if (!relatedAssociation.getIsNavigable())
    {
      if (av.isOne())
      {
        hasSomethingToDelete = true;
        
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1356);
    
      }
      else if (av.isMany())
      {
        hasSomethingToDelete = true;
        
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1358);
    
      }
      continue;
    }
    
    if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
    {
      
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1364);
    
    }
    else if (av.isOptionalOne() && relatedAssociation.isOptionalOne())
    {
      
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1368);
    
    }
    else if (av.isOnlyOne() && relatedAssociation.isOptionalOne())
    {
      
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1375);
    
    }
    else if (av.isOptionalOne() && relatedAssociation.isOnlyOne())
    {
      
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1381);
    
    }
    else if (av.isOptionalOne() && relatedAssociation.isOptionalMany())
    {
      
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1385);
    
    }
    else if (av.isOptionalOne() && relatedAssociation.isN())
    {
      
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1388);
    
    }
    else if (av.isOptionalOne() && relatedAssociation.isMN())
    {
      
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(gen.relatedTranslate("numberOfMethod",av));
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(relatedAssociation.getMultiplicity().getLowerBound());
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1396);
    
    }
    else if (av.isOne() && relatedAssociation.isMany())
    {
      
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1399);
    
    }
    else if (av.isMandatory() && relatedAssociation.isOptionalOne())
    {
      
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1405);
    
    }
    else if (av.isMany() && (relatedAssociation.isMN() || relatedAssociation.isN()))
    {
      
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(gen.translate("parameterCopyOfMany",av));
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(gen.translate("parameterCopyOfMany",av));
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(gen.relatedTranslate("numberOfMethod",av));
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1418);
    
    }
    else if (av.isMany() && relatedAssociation.isMany())
    {
      
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(gen.translate("parameterCopyOfMany",av));
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(gen.translate("parameterCopyOfMany",av));
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1426);
    
    }
    else if (av.isMany() && relatedAssociation.isOnlyOne())
    {
      
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1430);
    
    }
    else if (av.isMany() && relatedAssociation.isOptionalOne())
    {
      
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1435);
    
    }
    else
    {
      continue;
    }
    hasSomethingToDelete = true;
  }
  
  if (!uClass.isRoot() && !"external".equals(uClass.getExtendsClass().getModifier()))
  {
    hasSomethingToDelete = true;
    appendln(stringBuffer,"");
    append(stringBuffer, "    parent::delete();");
  }

  if (customDeletePostfixCode != null) 
  {
    append(stringBuffer, "\n    {0}",customDeletePostfixCode);
    hasSomethingToDelete = true;
  }
  
  if (hasSomethingToDelete)
  {
    appendln(stringBuffer, "");
    appendln(stringBuffer, "  }");
  }
  else
  {
    appendln(stringBuffer, "}");
  }
  
  

     if (uClass.getExtraCode() != null && uClass.getExtraCode().length() > 0) { 
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(uClass.getExtraCode());
     } 
    

{

	//==== Tracing Code    
    if( model.getTraceType().equals("File") && uClass.hasTraceDirectives() )
	{
		appendln(stringBuffer, "");
		appendln(stringBuffer, "  //------------------------");
		appendln(stringBuffer, "  // FILE TRACER METHOD");
		appendln(stringBuffer, "  //------------------------\n");
		appendln(stringBuffer, "  function fileTracer($tracedItem)");
		appendln(stringBuffer, "  {");
		appendln(stringBuffer, "    $file=fopen({0}TraceLog.txt{1},{3}a{4}) or exit({5}Unable to open file!{6});",'"','"','"','"','"','"','"');
		appendln(stringBuffer, "    fprintf($file,{0}Traced object value: $tracedItem{1}.PHP_EOL);",'"','"');
		appendln(stringBuffer, "    fprintf($file,{0}Trace time: {1}.date(DATE_RFC822).PHP_EOL);",'"','"');
		appendln(stringBuffer, "    fclose($file);");
		appendln(stringBuffer, "  }");
	}
}


    stringBuffer.append(TEXT_1438);
    return stringBuffer.toString();
  }
}