package fossils.fossils.client.blockentity.model.herrerasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HerrerasaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart basin;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head1;
	private final ModelPart jaw1;
	private final ModelPart jaw2;
	private final ModelPart jaw3;
	private final ModelPart lowerteeth2;
	private final ModelPart lowerteeth1;
	private final ModelPart head2;
	private final ModelPart head3;
	private final ModelPart teeth2;
	private final ModelPart head4;
	private final ModelPart teeth1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;
	private final ModelPart hand3;
	private final ModelPart hand4;
	private final ModelPart upperarm3;
	private final ModelPart lowerarm3;
	private final ModelPart hand5;
	private final ModelPart hand6;
	private final ModelPart hand7;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart upperleg1;
	private final ModelPart lowerleg1;
	private final ModelPart feet1;
	private final ModelPart toes1;
	private final ModelPart toes2;
	private final ModelPart upperleg2;
	private final ModelPart lowerleg2;
	private final ModelPart feet2;
	private final ModelPart toes3;
	private final ModelPart toes4;
	private final ModelPart bone2;
	private final ModelPart bone3;

	public HerrerasaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.basin = this.root.getChild("basin");
		this.body = this.basin.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head1 = this.neck4.getChild("head1");
		this.jaw1 = this.head1.getChild("jaw1");
		this.jaw2 = this.jaw1.getChild("jaw2");
		this.jaw3 = this.jaw2.getChild("jaw3");
		this.lowerteeth2 = this.jaw3.getChild("lowerteeth2");
		this.lowerteeth1 = this.jaw2.getChild("lowerteeth1");
		this.head2 = this.head1.getChild("head2");
		this.head3 = this.head2.getChild("head3");
		this.teeth2 = this.head3.getChild("teeth2");
		this.head4 = this.head3.getChild("head4");
		this.teeth1 = this.head2.getChild("teeth1");
		this.upperarm2 = this.chest.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
		this.hand3 = this.lowerarm2.getChild("hand3");
		this.hand4 = this.lowerarm2.getChild("hand4");
		this.upperarm3 = this.chest.getChild("upperarm3");
		this.lowerarm3 = this.upperarm3.getChild("lowerarm3");
		this.hand5 = this.lowerarm3.getChild("hand5");
		this.hand6 = this.lowerarm3.getChild("hand6");
		this.hand7 = this.lowerarm3.getChild("hand7");
		this.bone = this.chest.getChild("bone");
		this.bone4 = this.chest.getChild("bone4");
		this.tail1 = this.basin.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.upperleg1 = this.basin.getChild("upperleg1");
		this.lowerleg1 = this.upperleg1.getChild("lowerleg1");
		this.feet1 = this.lowerleg1.getChild("feet1");
		this.toes1 = this.feet1.getChild("toes1");
		this.toes2 = this.toes1.getChild("toes2");
		this.upperleg2 = this.basin.getChild("upperleg2");
		this.lowerleg2 = this.upperleg2.getChild("lowerleg2");
		this.feet2 = this.lowerleg2.getChild("feet2");
		this.toes3 = this.feet2.getChild("toes3");
		this.toes4 = this.toes3.getChild("toes4");
		this.bone2 = this.basin.getChild("bone2");
		this.bone3 = this.basin.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -31.0F, -0.7F, 1.0F, 31.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(2, 1).addBox(1.1F, -31.0F, -21.7F, 1.0F, 31.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-1.5F, -6.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(2, 1).addBox(-8.1F, -3.0F, 20.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -23.0F, -21.2F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition basin = root.addOrReplaceChild("basin", CubeListBuilder.create(), PartPose.offset(-0.2F, -9.2F, -0.5F));

		PartDefinition basin_r1 = basin.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(25, 13).addBox(0.2F, 0.9256F, -0.1548F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.6107F, -3.9205F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create().texOffs(17, 47).addBox(-0.3F, 0.4312F, -7.2294F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1728F, -3.7062F, 0.0088F, -0.0873F, -0.0008F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(34, 47).addBox(-0.9F, 0.4626F, -6.8909F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6F, -0.0314F, -7.2386F, 0.1222F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.6958F, -6.9236F, -0.0873F, -0.0435F, 0.0038F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(0, 47).addBox(0.1F, 0.0F, 0.1F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.639F, -6.7057F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(62, 72).addBox(-0.4F, -0.0056F, -4.4655F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(64, 74).addBox(-0.4F, -0.0056F, -0.7655F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3694F, -6.7967F, -0.2054F, 0.046F, 0.052F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0603F, -3.8577F, -0.6275F, 0.0443F, 0.1425F));

		PartDefinition neck3_r1 = neck2.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(64, 65).addBox(0.1F, 0.7F, 2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.7561F, -6.8926F, 0.2094F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.7591F, -4.747F, 0.2207F, -0.0485F, 0.2128F));

		PartDefinition neck4_r1 = neck3.addOrReplaceChild("neck4_r1", CubeListBuilder.create().texOffs(76, 84).addBox(0.1F, -0.3F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8012F, -3.3445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.36F, -2.8054F, 0.5074F, -0.0708F, -0.4239F));

		PartDefinition neck5_r1 = neck4.addOrReplaceChild("neck5_r1", CubeListBuilder.create().texOffs(30, 85).addBox(0.1F, -0.3F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.8012F, -3.3445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition head1 = neck4.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.52F, 0.5047F, -2.8429F, 0.357F, 0.0F, 0.0F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.45F, 0.4588F, 0.6109F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw1.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.1336F, -5.018F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.84F, -4.8F, -0.0456F, 0.0F, 0.0F));

		PartDefinition lowerteeth2 = jaw3.addOrReplaceChild("lowerteeth2", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, -0.1F));

		PartDefinition lowerteeth1 = jaw2.addOrReplaceChild("lowerteeth1", CubeListBuilder.create(), PartPose.offset(0.0F, -0.6F, 0.2F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0642F, -3.6355F, 0.0585F, 0.0F, 0.0F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8F, -5.1F, -0.0911F, 0.0F, 0.0F));

		PartDefinition teeth2 = head3.addOrReplaceChild("teeth2", CubeListBuilder.create(), PartPose.offset(0.0F, 2.2F, 0.5F));

		PartDefinition head4 = head3.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 1.7F, 0.07F, 0.0F, 0.0F));

		PartDefinition teeth1 = head2.addOrReplaceChild("teeth1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.7F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7011F, 6.3613F, -3.9922F, -0.2946F, -0.2192F, -0.4781F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0914F, 7.5409F, 3.1034F, -1.0136F, -0.2987F, 0.1323F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3409F, 6.0535F, -0.4402F, -0.1472F, -0.0699F, 0.2937F));

		PartDefinition hand3 = lowerarm2.addOrReplaceChild("hand3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0086F, 5.992F, 0.2563F, 0.0709F, -0.0699F, 0.2937F));

		PartDefinition hand4 = lowerarm2.addOrReplaceChild("hand4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2005F, 6.2237F, -0.0496F, 0.2891F, -0.0699F, 0.2937F));

		PartDefinition upperarm3 = chest.addOrReplaceChild("upperarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5011F, 6.3613F, -3.9922F, 0.0623F, -0.0451F, 0.0747F));

		PartDefinition lowerarm3 = upperarm3.addOrReplaceChild("lowerarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0914F, 7.5409F, 3.1034F, -0.8333F, 0.5563F, 0.3781F));

		PartDefinition hand5 = lowerarm3.addOrReplaceChild("hand5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3409F, 6.0535F, -0.4402F, -0.1472F, 0.0699F, -0.2937F));

		PartDefinition hand6 = lowerarm3.addOrReplaceChild("hand6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0086F, 5.992F, 0.2563F, 0.0709F, 0.0699F, -0.2937F));

		PartDefinition hand7 = lowerarm3.addOrReplaceChild("hand7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2005F, 6.2237F, -0.0496F, 0.3327F, 0.0699F, -0.2937F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-0.5F, 7.5838F, 1.0422F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.7F, 7.5838F, 1.0422F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 36).addBox(0.2F, 0.0479F, -0.3584F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 1.1873F, 6.0008F, -0.1231F, 0.2166F, -0.0266F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(23, 26).addBox(0.2F, 0.0899F, -0.516F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(30, 33).addBox(0.2F, 0.0899F, 7.184F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0351F, 7.8889F, 0.05F, 0.2615F, 0.0129F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(38, 37).addBox(0.2F, 0.2797F, -0.2717F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2772F, 8.004F, 0.1317F, 0.3463F, 0.0449F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(0.2F, 0.3668F, -0.5607F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F))
				.texOffs(10, 10).addBox(0.2F, 0.3668F, 10.1393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.067F, 7.6106F, 0.0542F, -0.305F, -0.0163F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 13).addBox(0.2F, 0.3668F, -0.3607F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0902F, -0.0696F, 10.6117F, -0.1196F, -0.3034F, 0.0359F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(25, 0).addBox(0.2F, 0.3669F, -0.2607F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2675F, -0.1317F, 10.2255F, -0.1762F, -0.647F, 0.1069F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 57).addBox(0.2F, 0.3668F, -0.2607F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0996F, -0.1462F, 10.3566F, -0.197F, -0.472F, 0.0905F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(19, 37).addBox(0.2F, 0.3668F, -0.4607F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0543F, -0.0312F, 5.7118F, -0.1526F, -0.2157F, 0.0329F));

		PartDefinition upperleg1 = basin.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4F, 2.7613F, 0.088F, -0.2618F, 0.0F, 0.0F));

		PartDefinition lowerleg1 = upperleg1.addOrReplaceChild("lowerleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 13.0933F, 1.5571F, 0.9599F, 0.0F, 0.0F));

		PartDefinition feet1 = lowerleg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 14.531F, 0.4592F, -0.5065F, 0.0F, 0.0F));

		PartDefinition toes1 = feet1.addOrReplaceChild("toes1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.1583F, 0.0265F, 0.1328F, 0.0F, 0.0F));

		PartDefinition toes2 = toes1.addOrReplaceChild("toes2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0141F, -2.64F, -0.2599F, 0.0F, 0.0F));

		PartDefinition upperleg2 = basin.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 2.7613F, 0.088F, -0.9581F, 0.0715F, 0.0501F));

		PartDefinition lowerleg2 = upperleg2.addOrReplaceChild("lowerleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 13.0933F, 1.5571F, 1.3456F, -0.0222F, -0.1359F));

		PartDefinition feet2 = lowerleg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 14.531F, 0.4592F, -1.5947F, 0.017F, 0.0409F));

		PartDefinition toes3 = feet2.addOrReplaceChild("toes3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.1583F, 0.0265F, 2.009F, 0.0F, 0.0F));

		PartDefinition toes4 = toes3.addOrReplaceChild("toes4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0141F, -2.64F, -0.129F, 0.0F, 0.0F));

		PartDefinition bone2 = basin.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.1F, 2.8694F, 0.0452F));

		PartDefinition bone3 = basin.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-1.7F, 2.8694F, 0.0452F));

		return LayerDefinition.create(meshdefinition, 123, 123);
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