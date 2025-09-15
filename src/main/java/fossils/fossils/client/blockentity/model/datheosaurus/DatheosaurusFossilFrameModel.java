package fossils.fossils.client.blockentity.model.datheosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DatheosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Datheosaurus;
	private final ModelPart hips;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart leftFoot3;
	private final ModelPart leftFoot4;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart rightFoot3;
	private final ModelPart rightFoot4;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart leftFoot;
	private final ModelPart leftFoot2;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart rightFoot;
	private final ModelPart rightFoot2;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart neck;
	private final ModelPart skullTop;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart skullJaw;

	public DatheosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Datheosaurus = this.fossil.getChild("Datheosaurus");
		this.hips = this.Datheosaurus.getChild("hips");
		this.Rightthigh = this.hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.leftFoot3 = this.Rightshin.getChild("leftFoot3");
		this.leftFoot4 = this.leftFoot3.getChild("leftFoot4");
		this.Leftthigh = this.hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.rightFoot3 = this.Leftshin.getChild("rightFoot3");
		this.rightFoot4 = this.rightFoot3.getChild("rightFoot4");
		this.bone2 = this.hips.getChild("bone2");
		this.bone3 = this.hips.getChild("bone3");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.Rightupperarm = this.chest.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.leftFoot = this.Rightlowerarm.getChild("leftFoot");
		this.leftFoot2 = this.leftFoot.getChild("leftFoot2");
		this.Leftupperarm = this.chest.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.rightFoot = this.Leftlowerarm.getChild("rightFoot");
		this.rightFoot2 = this.rightFoot.getChild("rightFoot2");
		this.bone = this.chest.getChild("bone");
		this.bone4 = this.chest.getChild("bone4");
		this.neck = this.chest.getChild("neck");
		this.skullTop = this.neck.getChild("skullTop");
		this.leftFace = this.skullTop.getChild("leftFace");
		this.rightFace = this.skullTop.getChild("rightFace");
		this.skullJaw = this.skullTop.getChild("skullJaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -9.0F, 8.8F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -2.95F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(7.4F, -6.85F, -10.5F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(1.35F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(7.4F, -6.85F, -10.5F, -0.9163F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(1.4F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -8.5F, 9.3F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Datheosaurus = fossil.addOrReplaceChild("Datheosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.5F, -1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition hips = Datheosaurus.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.1199F, 11.9095F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(26, 29).addBox(-0.5F, -0.3904F, 7.191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(19, 22).addBox(-0.5F, -0.3904F, -0.509F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2266F, -3.0755F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Rightthigh = hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(1.644F, 1.7111F, -1.7597F, -0.464F, -0.0857F, -1.4488F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3884F, 5.3559F, -0.4402F, 1.2481F, -1.1797F, 0.1203F));

		PartDefinition leftFoot3 = Rightshin.addOrReplaceChild("leftFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8224F, 5.695F, 0.4719F, 2.8663F, 0.6868F, -3.1353F));

		PartDefinition leftFoot4 = leftFoot3.addOrReplaceChild("leftFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.6F, 0.5F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Leftthigh = hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.644F, 1.7111F, -1.7597F, -0.1586F, 0.0857F, 1.4488F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3884F, 5.3559F, -0.4402F, 1.4295F, 0.5391F, 0.1066F));

		PartDefinition rightFoot3 = Leftshin.addOrReplaceChild("rightFoot3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8224F, 5.695F, 0.4719F, 2.5907F, -0.2567F, 3.0772F));

		PartDefinition rightFoot4 = rightFoot3.addOrReplaceChild("rightFoot4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.5F, 0.0F, 0.0F, 0.4363F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0416F, 1.0794F, -1.2317F, 0.1309F, 0.0F, 0.2618F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0416F, 1.0794F, -1.2317F, 0.1309F, 0.0F, -0.2618F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6542F, 4.6243F, 0.0703F, 0.2612F, 0.0182F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.2432F, -0.5009F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1844F, 0.3155F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8392F, 9.1501F, -0.0247F, 0.2181F, -0.0053F));

		PartDefinition cube_r6 = tail2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 37).addBox(-0.5F, 0.4F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 32).addBox(-0.5F, 0.4F, -4.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9117F, 5.6011F, -0.0191F, 0.3054F, -0.0058F));

		PartDefinition cube_r7 = tail3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(38, 22).addBox(-1.0F, -0.25F, -2.85F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 1.2749F, 2.4865F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8214F, 5.7215F, -0.1425F, 0.216F, -0.0307F));

		PartDefinition cube_r8 = tail4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(49, 34).addBox(-0.5F, 2.45F, -1.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 30).addBox(-0.5F, 2.45F, -6.65F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.8166F, 6.3062F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, 0.1675F, -0.0812F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(4, 50).addBox(-0.5F, 0.1675F, 4.4188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 0.2931F, 4.8349F, -0.1179F, 0.1968F, -0.2375F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(13, 46).addBox(-0.5F, 0.1675F, -0.0812F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(17, 50).addBox(-0.5F, 0.1675F, 4.4188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, 0.0146F, 4.9356F, 0.0788F, 0.5613F, 0.1622F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(26, 46).addBox(-0.5F, 0.1675F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0111F, 5.0005F, -0.0662F, 0.6108F, 0.0121F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(49, 37).addBox(-0.5F, 0.1675F, -0.3812F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(53, 41).addBox(-0.5F, 0.1675F, 4.3188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 5.001F, 0.0177F, 0.2181F, 0.0038F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, 0.1675F, -0.1812F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 3).addBox(-0.5F, 0.1675F, 4.5188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 5.001F, 0.0962F, -0.2182F, -0.0019F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(39, 46).addBox(-0.5623F, 0.1425F, 0.0192F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0623F, 0.0379F, 5.0301F, -0.0333F, -0.5236F, -0.0052F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5176F, 0.1425F, -0.3805F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0447F, -0.0075F, 4.9427F, -0.0011F, -0.3904F, 0.138F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.901F, -3.0697F, -0.2112F, -0.128F, 0.0274F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -0.6F, 6.9974F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2746F, -12.9819F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3215F, -6.0276F, -0.0643F, -0.0871F, 0.0056F));

		PartDefinition cube_r10 = body2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(60, 32).addBox(-0.5F, 0.3285F, 6.2779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(58, 30).addBox(-0.5F, 0.3285F, 3.5779F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -6.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2404F, -2.9212F, 0.0501F, -0.1743F, -0.0087F));

		PartDefinition cube_r11 = body3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(48, 55).addBox(-0.5F, 0.3285F, 3.8779F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -6.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.221F, -2.9507F, 0.1202F, -0.13F, -0.0157F));

		PartDefinition cube_r12 = body4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(57, 12).addBox(-0.5F, 0.3285F, 4.1779F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -6.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4267F, -2.8855F, 0.0953F, -0.2172F, -0.0206F));

		PartDefinition cube_r13 = chest.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(35, 37).addBox(-0.5F, 0.3285F, 8.4779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(30, 32).addBox(-0.5F, 0.3285F, 2.7779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = chest.addOrReplaceChild("Rightupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1405F, 5.0386F, -5.5873F, 0.8495F, 0.1425F, -1.2048F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5088F, 5.8349F, -0.3301F, -1.7211F, 0.2324F, -0.4085F));

		PartDefinition leftFoot = Rightlowerarm.addOrReplaceChild("leftFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1121F, 4.7957F, 0.2085F, -0.2076F, 0.1373F, 0.9926F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.6F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition Leftupperarm = chest.addOrReplaceChild("Leftupperarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.1405F, 5.0386F, -5.5873F, -0.6479F, -0.2539F, 1.275F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5088F, 5.8349F, -0.3301F, -1.228F, -0.356F, 0.3634F));

		PartDefinition rightFoot = Leftlowerarm.addOrReplaceChild("rightFoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1121F, 4.7957F, 0.2085F, -0.1203F, -0.1373F, -0.9926F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9395F, 2.3127F, -7.1117F, -0.0115F, 0.1304F, -0.088F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9395F, 2.3127F, -7.1117F, -0.0115F, -0.1304F, 0.088F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5414F, -5.7509F, -0.0734F, -0.3492F, -0.0868F));

		PartDefinition cube_r14 = neck.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(42, 7).addBox(-1.0F, -2.2F, -3.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition skullTop = neck.addOrReplaceChild("skullTop", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.3611F, -3.7373F, -0.3936F, -0.3051F, 0.0134F));

		PartDefinition leftFace = skullTop.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -1.1F, -0.1F));

		PartDefinition rightFace = skullTop.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(0.5F, -1.1F, -0.1F));

		PartDefinition skullJaw = skullTop.addOrReplaceChild("skullJaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5012F, 0.9486F, 0.4826F, 0.5934F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 86, 86);
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