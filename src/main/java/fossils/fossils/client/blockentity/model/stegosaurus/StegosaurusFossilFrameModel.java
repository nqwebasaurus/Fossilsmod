package fossils.fossils.client.blockentity.model.stegosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class StegosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart body;
	private final ModelPart plate2;
	private final ModelPart backleftleg;
	private final ModelPart backleftleg2;
	private final ModelPart backleftleg3;
	private final ModelPart backleftleg4;
	private final ModelPart backrightleg;
	private final ModelPart backrightleg2;
	private final ModelPart backrightleg3;
	private final ModelPart backrightleg4;
	private final ModelPart tail;
	private final ModelPart plate3;
	private final ModelPart tail2;
	private final ModelPart plate4;
	private final ModelPart tail3;
	private final ModelPart plate5;
	private final ModelPart tail4;
	private final ModelPart plate6;
	private final ModelPart tail5;
	private final ModelPart plate7;
	private final ModelPart tail7;
	private final ModelPart tail6;
	private final ModelPart thagomizer2;
	private final ModelPart thagomizer4;
	private final ModelPart thagomizer3;
	private final ModelPart thagomizer5;
	private final ModelPart plate9;
	private final ModelPart plate10;
	private final ModelPart body2;
	private final ModelPart plate8;
	private final ModelPart upperbody;
	private final ModelPart plate11;
	private final ModelPart plate12;
	private final ModelPart chest;
	private final ModelPart plate13;
	private final ModelPart plate19;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontleftleg4;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart frontrightleg4;
	private final ModelPart neck;
	private final ModelPart plate14;
	private final ModelPart plate15;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart plate20;
	private final ModelPart neck2;
	private final ModelPart plate21;
	private final ModelPart plate16;
	private final ModelPart neck6;
	private final ModelPart plate17;
	private final ModelPart plate22;
	private final ModelPart neck3;
	private final ModelPart plate23;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart eye;
	private final ModelPart eye2;
	private final ModelPart jaw;

	public StegosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.body = this.main.getChild("body");
		this.plate2 = this.body.getChild("plate2");
		this.backleftleg = this.body.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backleftleg3 = this.backleftleg2.getChild("backleftleg3");
		this.backleftleg4 = this.backleftleg3.getChild("backleftleg4");
		this.backrightleg = this.body.getChild("backrightleg");
		this.backrightleg2 = this.backrightleg.getChild("backrightleg2");
		this.backrightleg3 = this.backrightleg2.getChild("backrightleg3");
		this.backrightleg4 = this.backrightleg3.getChild("backrightleg4");
		this.tail = this.body.getChild("tail");
		this.plate3 = this.tail.getChild("plate3");
		this.tail2 = this.tail.getChild("tail2");
		this.plate4 = this.tail2.getChild("plate4");
		this.tail3 = this.tail2.getChild("tail3");
		this.plate5 = this.tail3.getChild("plate5");
		this.tail4 = this.tail3.getChild("tail4");
		this.plate6 = this.tail4.getChild("plate6");
		this.tail5 = this.tail4.getChild("tail5");
		this.plate7 = this.tail5.getChild("plate7");
		this.tail7 = this.tail5.getChild("tail7");
		this.tail6 = this.tail7.getChild("tail6");
		this.thagomizer2 = this.tail6.getChild("thagomizer2");
		this.thagomizer4 = this.tail6.getChild("thagomizer4");
		this.thagomizer3 = this.tail6.getChild("thagomizer3");
		this.thagomizer5 = this.tail6.getChild("thagomizer5");
		this.plate9 = this.tail7.getChild("plate9");
		this.plate10 = this.tail7.getChild("plate10");
		this.body2 = this.body.getChild("body2");
		this.plate8 = this.body2.getChild("plate8");
		this.upperbody = this.body2.getChild("upperbody");
		this.plate11 = this.upperbody.getChild("plate11");
		this.plate12 = this.upperbody.getChild("plate12");
		this.chest = this.upperbody.getChild("chest");
		this.plate13 = this.chest.getChild("plate13");
		this.plate19 = this.chest.getChild("plate19");
		this.frontleftleg2 = this.chest.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontleftleg4 = this.frontleftleg3.getChild("frontleftleg4");
		this.frontrightleg2 = this.chest.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.frontrightleg4 = this.frontrightleg3.getChild("frontrightleg4");
		this.neck = this.chest.getChild("neck");
		this.plate14 = this.neck.getChild("plate14");
		this.plate15 = this.neck.getChild("plate15");
		this.neck4 = this.neck.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.plate20 = this.neck5.getChild("plate20");
		this.neck2 = this.neck5.getChild("neck2");
		this.plate21 = this.neck2.getChild("plate21");
		this.plate16 = this.neck2.getChild("plate16");
		this.neck6 = this.neck2.getChild("neck6");
		this.plate17 = this.neck6.getChild("plate17");
		this.plate22 = this.neck6.getChild("plate22");
		this.neck3 = this.neck6.getChild("neck3");
		this.plate23 = this.neck3.getChild("plate23");
		this.head = this.neck3.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.eye = this.head.getChild("eye");
		this.eye2 = this.head.getChild("eye2");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -44.0F, 6.2F, 1.0F, 44.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(2.9F, -11.0F, -0.5F, 1.0F, 38.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -27.0F, -22.4F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-3.2F, -3.5F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -27.0F, -22.4F, 0.2182F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(13.0F, -8.5F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -28.5F, 6.7F, 0.0F, 0.0F, -1.5708F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 2.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -40.4078F, 3.5545F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(111, 95).addBox(-0.5F, -0.4358F, 0.481F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -3.3139F, -3.369F, -0.0873F, 0.0F, 0.0F));

		PartDefinition plate2 = body.addOrReplaceChild("plate2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4764F, -13.2659F, -0.7516F, -0.109F, 0.001F, -0.0971F));

		PartDefinition backleftleg = body.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(7.0F, -0.7077F, 0.6028F, 0.0873F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.9936F, -0.4037F, 0.4363F, 0.0F, 0.0F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0342F, 15.7939F, 1.8943F, -0.2607F, -0.0084F, -0.0044F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.1114F, -0.4115F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backrightleg = body.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.0F, -0.7077F, 0.6028F, -0.3491F, 0.0F, 0.0F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.9936F, -0.4037F, 1.0908F, 0.0F, 0.0F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0342F, 15.7939F, 1.8943F, 0.2629F, 0.0084F, 0.0044F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.1114F, -0.4115F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -3.4095F, 4.3369F, 0.1688F, 0.1794F, -0.0132F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(87, 0).addBox(-0.5F, 0.2711F, 0.1702F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.0972F, -0.1185F, -0.0436F, 0.0F, 0.0F));

		PartDefinition plate3 = tail.addOrReplaceChild("plate3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9319F, -9.5479F, 8.8283F, 0.1092F, -0.001F, 0.0971F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.539F, 10.1152F, -0.2732F, 0.2637F, -0.0293F));

		PartDefinition cube_r6 = tail2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(69, 91).addBox(-0.5F, 0.067F, -0.2727F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.1919F, 0.0825F, 0.0436F, 0.0F, 0.0F));

		PartDefinition plate4 = tail2.addOrReplaceChild("plate4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9021F, -9.8955F, 9.4953F, -0.109F, 0.001F, -0.0971F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5276F, 8.6745F, -0.0916F, 0.3042F, -0.0275F));

		PartDefinition cube_r7 = tail3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(90, 87).addBox(-0.5F, -0.0878F, 0.1652F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.5704F, -0.0912F, 0.0436F, 0.0F, 0.0F));

		PartDefinition plate5 = tail3.addOrReplaceChild("plate5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6852F, -7.2781F, 13.6071F, -0.1963F, -0.001F, 0.0971F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.2853F, 9.1346F, -0.1002F, 0.2131F, -0.0641F));

		PartDefinition cube_r8 = tail4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(60, 39).addBox(-0.5F, -0.2709F, -0.6162F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6479F, 0.2589F, 0.0436F, 0.0F, 0.0F));

		PartDefinition plate6 = tail4.addOrReplaceChild("plate6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0706F, -5.9338F, 15.4672F, -0.109F, 0.001F, -0.0971F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.4209F, 12.6065F, -0.1833F, 0.3006F, -0.0548F));

		PartDefinition cube_r9 = tail5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(92, 46).addBox(-0.5F, -1.8F, -0.1F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.2561F, -0.8306F, 0.0349F, 0.0F, 0.0F));

		PartDefinition plate7 = tail5.addOrReplaceChild("plate7", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5281F, -5.1514F, 9.8627F, -0.109F, -0.001F, 0.0971F));

		PartDefinition tail7 = tail5.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(145, 51).addBox(-0.5F, 0.8F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.5786F, 7.9725F, -0.1828F, 0.3006F, -0.0547F));

		PartDefinition tail6 = tail7.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(90, 99).addBox(-0.5F, 0.1889F, -0.5591F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5171F, 6.0408F, -0.2347F, 0.2975F, -0.07F));

		PartDefinition thagomizer2 = tail6.addOrReplaceChild("thagomizer2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0025F, -0.9742F, 1.6481F, -0.0917F, -0.2841F, -0.5728F));

		PartDefinition thagomizer4 = tail6.addOrReplaceChild("thagomizer4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0025F, -0.9742F, 1.6481F, -0.0917F, 0.2841F, 0.5728F));

		PartDefinition thagomizer3 = tail6.addOrReplaceChild("thagomizer3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6821F, -0.4726F, 5.5156F, -0.1128F, -0.6749F, -0.5279F));

		PartDefinition thagomizer5 = tail6.addOrReplaceChild("thagomizer5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6821F, -0.4726F, 5.5156F, -0.1128F, 0.6749F, 0.5279F));

		PartDefinition plate9 = tail7.addOrReplaceChild("plate9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9259F, -3.6167F, 7.1171F, -0.109F, 0.001F, -0.0971F));

		PartDefinition plate10 = tail7.addOrReplaceChild("plate10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8866F, -3.2489F, 10.4969F, -0.109F, -0.001F, 0.0971F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -4.0768F, -3.0647F, 0.1583F, -0.1289F, -0.0031F));

		PartDefinition cube_r10 = body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(46, 72).addBox(0.5F, 0.1F, 1.95F, 1.0F, 2.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.1608F, -12.5096F, -0.0349F, 0.0F, 0.0F));

		PartDefinition plate8 = body2.addOrReplaceChild("plate8", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1536F, -10.9055F, -7.2137F, 0.0655F, -0.001F, 0.0971F));

		PartDefinition upperbody = body2.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2835F, -10.6105F, -0.1051F, 0.0F, 0.0F));

		PartDefinition cube_r11 = upperbody.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(51, 128).addBox(0.0F, 0.0665F, -6.2319F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3525F, -0.3671F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r12 = upperbody.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(17, 126).addBox(0.0F, 0.5636F, -6.8463F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.9525F, -6.3671F, 0.4887F, 0.0F, 0.0F));

		PartDefinition plate11 = upperbody.addOrReplaceChild("plate11", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1536F, -9.3945F, -6.4766F, 0.4146F, 0.001F, -0.0971F));

		PartDefinition plate12 = upperbody.addOrReplaceChild("plate12", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9348F, -7.0815F, -12.9435F, 0.6589F, -0.001F, 0.0971F));

		PartDefinition chest = upperbody.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(92, 58).addBox(-0.6064F, 0.7F, -9.2F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6064F, 4.9757F, -12.2513F, 0.808F, -0.1233F, -0.003F));

		PartDefinition plate13 = chest.addOrReplaceChild("plate13", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3456F, -10.0756F, 1.7756F, 0.2662F, 0.001F, -0.0971F));

		PartDefinition plate19 = chest.addOrReplaceChild("plate19", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0218F, -8.8642F, -5.0733F, -0.1701F, -0.001F, 0.0971F));

		PartDefinition frontleftleg2 = chest.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.3504F, 11.5517F, -12.313F, -0.0842F, -0.05F, -0.121F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5744F, 11.624F, 0.5224F, -1.3937F, 0.0216F, 0.1318F));

		PartDefinition frontleftleg4 = frontleftleg3.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0618F, 12.5457F, -1.3371F, 1.693F, 0.0F, 0.0F));

		PartDefinition frontrightleg2 = chest.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.5633F, 11.5517F, -12.313F, -0.2588F, 0.05F, 0.121F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5744F, 11.624F, 0.5224F, -0.4338F, -0.0216F, -0.1318F));

		PartDefinition frontrightleg4 = frontrightleg3.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0618F, 12.5457F, -1.3371F, -0.0087F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6064F, 0.8647F, -8.8819F, -1.2032F, 0.0F, 0.0F));

		PartDefinition cube_r13 = neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(140, 122).addBox(-0.5F, 0.1907F, 5.2235F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(135, 117).addBox(-0.5F, 0.1907F, -0.4765F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 3.3903F, -4.3943F, 0.7243F, 0.0F, 0.0F));

		PartDefinition plate14 = neck.addOrReplaceChild("plate14", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5581F, -0.5183F, -6.6784F, 0.1221F, 0.0378F, -0.1681F));

		PartDefinition plate15 = neck.addOrReplaceChild("plate15", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4581F, 0.4817F, -8.6784F, -0.096F, -0.0378F, 0.1681F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.7903F, -3.8943F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r14 = neck4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(182, 144).addBox(-0.5F, -0.9272F, -0.5582F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(180, 142).addBox(-0.5F, -0.9272F, -3.2582F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6103F, -2.7881F, 0.2327F, -0.1417F, -0.1659F));

		PartDefinition cube_r15 = neck5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(124, 145).addBox(-0.5F, 0.2246F, 1.8669F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(119, 140).addBox(-0.5F, 0.2246F, -3.8331F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6F, -2.6F, -0.1047F, 0.0F, 0.0F));

		PartDefinition plate20 = neck5.addOrReplaceChild("plate20", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5251F, -7.8069F, -2.1608F, 0.0917F, 0.001F, -0.0971F));

		PartDefinition neck2 = neck5.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8586F, -6.0224F, -0.0419F, -0.3911F, -0.0404F));

		PartDefinition cube_r16 = neck2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(128, 55).addBox(-0.5F, 0.3197F, -3.1913F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5789F, -3.6993F, -0.0873F, 0.0F, 0.0F));

		PartDefinition plate21 = neck2.addOrReplaceChild("plate21", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3996F, -5.6049F, -1.3525F, -0.0392F, -0.001F, 0.0971F));

		PartDefinition plate16 = neck2.addOrReplaceChild("plate16", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2063F, -3.5764F, -5.5355F, -0.0217F, 0.001F, -0.0971F));

		PartDefinition neck6 = neck2.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5789F, -6.6993F, -0.132F, -0.4517F, -0.1018F));

		PartDefinition cube_r17 = neck6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 150).addBox(-0.5F, 0.0F, -4.9F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition plate17 = neck6.addOrReplaceChild("plate17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1588F, -2.4738F, -2.2485F, -0.0217F, -0.001F, 0.0971F));

		PartDefinition plate22 = neck6.addOrReplaceChild("plate22", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0984F, -1.8289F, -4.6631F, -0.0217F, 0.001F, -0.0971F));

		PartDefinition neck3 = neck6.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3708F, -4.9169F, 0.1351F, 0.0F, 0.0F));

		PartDefinition cube_r18 = neck3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(183, 126).addBox(-0.5F, 0.05F, -5.15F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2857F, 2.5523F, 0.0873F, 0.0F, 0.0F));

		PartDefinition plate23 = neck3.addOrReplaceChild("plate23", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0456F, -1.6393F, -1.4588F, -0.0217F, -0.001F, 0.0971F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8222F, -2.533F, 0.0553F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.6028F, -1.0518F, -2.7607F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.6028F, -1.0518F, -2.7607F));

		PartDefinition eye = head.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.775F, -0.11F, -3.441F, -0.1745F, 0.0F, 0.0F));

		PartDefinition eye2 = head.addOrReplaceChild("eye2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.775F, -0.11F, -3.441F, -0.1745F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2209F, 0.0894F, 0.7723F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 208, 208);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}